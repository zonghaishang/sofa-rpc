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

import com.alipay.sofa.rpc.dynamic.configer.DrmDynamicConfiger;
import com.alipay.sofa.rpc.dynamic.configer.DynamicConfiger;
import com.alipay.sofa.rpc.dynamic.model.ApplicationDynamicConfig;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DynamicConfigManagerTest {

    @Test
    public void testApplicationUsage() {

        final String appName = "testApp";

        DynamicConfigManager dynamicConfigManager = new DynamicConfigManagerImpl();
        ApplicationDynamicConfig applicationDynamicConfig = new ApplicationDynamicConfig();
        DynamicConfiger dynamicConfiger = new DrmDynamicConfiger();
        applicationDynamicConfig.setDynamicConfiger(dynamicConfiger);
        applicationDynamicConfig.regist("app-testApp");
        dynamicConfigManager.addApplicationConfig(appName, applicationDynamicConfig);

        ApplicationDynamicConfig fetchApplicationConfig = dynamicConfigManager.fetchApplicationConfig(appName);
        String value = fetchApplicationConfig.key("key");

        Assert.assertNull(value);

        //模拟推送

        Map<String, String> newValue = new ConcurrentHashMap<>();
        newValue.put("key", "value");
        applicationDynamicConfig.onChanged("app-testApp", newValue);

        value = fetchApplicationConfig.key("key");

        Assert.assertEquals(value, value);


    }
}