/*
 * 文  件   名: Distribution.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月2日
 */
package org.anttribe.openeshop.base.domain;

import java.util.List;

import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * @author zhaoyong
 * @version 2016年4月2日
 */
public class Distribution extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3568045163243414428L;
    
    /**
     * 名称
     */
    private String name;
    
    /**
     * 唯一code
     */
    private String code;
    
    /**
     * 图标
     */
    private String icon;
    
    /**
     * 配置信息json字符串
     */
    private String config;
    
    /**
     * 配置
     */
    private List<ConfigItem> configs;
    
    /**
     * 是否可用
     */
    private String enabled;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setCode(String code)
    {
        this.code = code;
    }
    
    public String getIcon()
    {
        return icon;
    }
    
    public void setIcon(String icon)
    {
        this.icon = icon;
    }
    
    public String getConfig()
    {
        return config;
    }
    
    public void setConfig(String config)
    {
        this.config = config;
    }
    
    public List<ConfigItem> getConfigs()
    {
        return configs;
    }
    
    public void setConfigs(List<ConfigItem> configs)
    {
        this.configs = configs;
    }
    
    public String getEnabled()
    {
        return enabled;
    }
    
    public void setEnabled(String enabled)
    {
        this.enabled = enabled;
    }
}