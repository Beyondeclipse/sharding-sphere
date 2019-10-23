/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package info.avalon566.shardingscaling.core.job;

import info.avalon566.shardingscaling.core.config.SyncConfiguration;
import info.avalon566.shardingscaling.core.config.SyncType;
import info.avalon566.shardingscaling.core.config.RdbmsConfiguration;
import info.avalon566.shardingscaling.core.job.schedule.Event;
import info.avalon566.shardingscaling.core.job.schedule.EventType;
import info.avalon566.shardingscaling.core.job.schedule.Reporter;
import info.avalon566.shardingscaling.core.job.schedule.standalone.InProcessScheduler;
import info.avalon566.shardingscaling.core.sync.reader.ReaderFactory;
import info.avalon566.shardingscaling.core.sync.util.DataSourceFactory;
import info.avalon566.shardingscaling.core.sync.util.DbMetaDataUtil;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * History data syncer.
 *
 * @author avalon566
 */
@Slf4j
public class HistoryDataSyncer {

    private final SyncConfiguration syncConfiguration;

    public HistoryDataSyncer(final SyncConfiguration syncConfiguration) {
        this.syncConfiguration = syncConfiguration;
    }

    /**
     * Run.
     */
    public final void run() {
        List<SyncConfiguration> configs = split(syncConfiguration);
        Reporter reporter = new InProcessScheduler().schedule(configs);
        waitSlicesFinished(configs, reporter);
    }

    private List<SyncConfiguration> split(final SyncConfiguration syncConfiguration) {
        List<SyncConfiguration> syncConfigurations = new ArrayList<>();
        // split by table
        DataSource dataSource = DataSourceFactory.getDataSource(syncConfiguration.getReaderConfiguration().getDataSourceConfiguration());
        for (String tableName : new DbMetaDataUtil(dataSource).getTableNames()) {
            RdbmsConfiguration readerConfig = RdbmsConfiguration.clone(syncConfiguration.getReaderConfiguration());
            readerConfig.setTableName(tableName);
            // split by primary key range
            for (RdbmsConfiguration sliceConfig : ReaderFactory.newInstanceJdbcReader(readerConfig).split(syncConfiguration.getConcurrency())) {
                syncConfigurations.add(new SyncConfiguration(SyncType.TableSlice, syncConfiguration.getConcurrency(),
                        sliceConfig, RdbmsConfiguration.clone(syncConfiguration.getWriterConfiguration())));
            }
        }
        return syncConfigurations;
    }

    private void waitSlicesFinished(final List<SyncConfiguration> syncConfigurations, final Reporter reporter) {
        int counter = 0;
        while (true) {
            Event event = reporter.consumeEvent();
            if (EventType.FINISHED == event.getEventType()) {
                counter++;
            }
            if (syncConfigurations.size() == counter) {
                log.info("history data sync finish");
                break;
            }
        }
    }
}
