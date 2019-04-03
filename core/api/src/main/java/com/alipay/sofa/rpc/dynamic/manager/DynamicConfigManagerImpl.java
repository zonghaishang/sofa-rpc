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
package com.alipay.sofa.rpc.dynamic.manager;

import com.alipay.sofa.rpc.dynamic.model.ApplicationDynamicConfig;
import com.alipay.sofa.rpc.dynamic.model.AttributeDynamicConfig;
import com.alipay.sofa.rpc.dynamic.model.InterfaceDynamicConfig;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bystander
 * @version : DynamicConfigManager.java, v 0.1 2019年04月02日 20:30 bystander Exp $
 */
public class DynamicConfigManagerImpl implements DynamicConfigManager {

    /**
     * app config
     */
    private Map<String, ApplicationDynamicConfig> applicationDynamicConfigs = new ConcurrentHashMap<>();


    /**
     * interface config
     */
    private Map<String, InterfaceDynamicConfig> interfaceDynamicConfigs = new ConcurrentHashMap<>();


    /**
     * attr config
     */
    private Map<String, AttributeDynamicConfig> attributeDynamicConfigs = new ConcurrentHashMap<>();

    @Override
    public ApplicationDynamicConfig fetchApplicationConfig(String appName) {
        return applicationDynamicConfigs.get(appName);
    }

    @Override
    public InterfaceDynamicConfig fetchInterfaceDynamicConfig(String serviceKey, String type) {
        return interfaceDynamicConfigs.get(serviceKey);
    }

    @Override
    public AttributeDynamicConfig fetchAttributeDynamicConfig(String serviceKey, String type) {
        return attributeDynamicConfigs.get(serviceKey);
    }

    @Override
    public boolean addApplicationConfig(String appName, ApplicationDynamicConfig applicationDynamicConfig) {
        applicationDynamicConfigs.put(appName, applicationDynamicConfig);
        return true;
    }

    @Override
    public boolean addInterfaceDynamicConfig(String appName, InterfaceDynamicConfig interfaceDynamicConfig) {
        interfaceDynamicConfigs.put(appName, interfaceDynamicConfig);
        return true;
    }

    @Override
    public boolean addAttributeDynamicConfig(String appName, AttributeDynamicConfig attributeDynamicConfig) {

        attributeDynamicConfigs.put(appName, attributeDynamicConfig);
        return true;
    }
}