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
package com.alipay.sofa.rpc.dynamic.model;

import com.alipay.sofa.rpc.dynamic.listener.DynamicConfigListener;

import java.util.Map;

/**
 * @author bystander
 * @version : AttributeDynamicConfig.java, v 0.1 2019年04月02日 20:28 bystander Exp $
 */
public class AttributeDynamicConfig implements DynamicConfig, DynamicConfigListener {
    @Override
    public String key(String key) {
        return null;
    }

    @Override
    public boolean regist(String key) {
        return false;
    }

    @Override
    public void onChanged(String key, Map<String, String> values) {

    }
}