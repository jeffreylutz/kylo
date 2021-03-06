package com.thinkbiganalytics.nifi.v2.core.feedinit;

/*-
 * #%L
 * thinkbig-nifi-core-service
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean configuration for water mark management.
 */
@Configuration
public class FeedInitializationJmsConfiguration {

    /**
     * Constructs the consumer for water mark cancel events.
     *
     * @return the cancel event consumer
     */
    @Bean
    public FeedInitializationChangeEventConsumer feedInitializationChangeEventConsumer() {
        return new FeedInitializationChangeEventConsumer();
    }
}
