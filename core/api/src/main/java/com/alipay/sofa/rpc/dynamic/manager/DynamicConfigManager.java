/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
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