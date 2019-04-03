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

/**
 * @author bystander
 * @version : DynamicConfigManager.java, v 0.1 2019年04月02日 20:30 bystander Exp $
 */
public interface DynamicConfigManager {

    /**
     * 获取当前应用的app 动态配置,可为空
     *
     * @return
     */
    public ApplicationDynamicConfig fetchApplicationConfig(String appName);

    /**
     * type 是 provider/consumer
     *
     * @param serviceKey 接口名+1.0+uniqued
     * @param type       type 是 provider/consumer
     * @return
     */
    public InterfaceDynamicConfig fetchInterfaceDynamicConfig(String serviceKey, String type);

    /**
     * @param serviceKey 接口名+1.0+uniqued
     * @param type       type 是 provider/consumer
     * @return
     */
    public AttributeDynamicConfig fetchAttributeDynamicConfig(String serviceKey, String type);

    /**
     * add application Config
     * @param appName
     * @param applicationDynamicConfig
     * @return
     */
    public boolean addApplicationConfig(String appName, ApplicationDynamicConfig applicationDynamicConfig);

    /**
     * add interface application config
     * @param appName
     * @param interfaceDynamicConfig
     * @return
     */
    public boolean addInterfaceDynamicConfig(String appName, InterfaceDynamicConfig interfaceDynamicConfig);

    /**
     * add attribute dynamic config
     * @param appName
     * @param attributeDynamicConfig
     * @return
     */
    public boolean addAttributeDynamicConfig(String appName, AttributeDynamicConfig attributeDynamicConfig);

}