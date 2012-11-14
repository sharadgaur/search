/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.flume.sink.solr.indexer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.typesafe.config.Config;

/**
 * Application configuration object.
 */
public class Configuration {

	private final Config treeConfig;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Configuration.class);
	
	public Configuration(Config config) {
//		config.checkValid(ConfigFactory.defaultReference()); // eagerly validate aspects of tree config		
//		config = config.getConfig(getClass().getPackage().getName());
		this.treeConfig = config;
		validate(); // eagerly validate some more
		LOGGER.debug("Initialized using configuration data: {}", treeConfig.root().render());
	}
	
	public Config getTreeConfig() {
		return treeConfig;
	}
	
	/* Eager domain specific validation */
	private void validate() {
	}
	
}