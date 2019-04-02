/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
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
        return null;
    }

    @Override
    public InterfaceDynamicConfig fetchInterfaceDynamicConfig(String serviceKey, String type) {
        return null;
    }

    @Override
    public AttributeDynamicConfig fetchAttributeDynamicConfig(String serviceKey, String type) {
        return null;
    }

    @Override
    public boolean addApplicationConfig(String appName, ApplicationDynamicConfig applicationDynamicConfig) {
        applicationDynamicConfigs.put(appName, applicationDynamicConfig);
        return true;
    }

    @Override
    public boolean addInterfaceDynamicConfig(String appName, InterfaceDynamicConfig interfaceDynamicConfig) {
        interfaceDynamicConfigs.put(appName,interfaceDynamicConfig);
        return true;
    }

    @Override
    public boolean addAttributeDynamicConfig(String appName, AttributeDynamicConfig attributeDynamicConfig) {

        attributeDynamicConfigs.put(appName,attributeDynamicConfig);
        return true;
    }
}