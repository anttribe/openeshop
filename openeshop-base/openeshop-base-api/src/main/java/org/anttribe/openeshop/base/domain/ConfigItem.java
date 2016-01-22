/*
 * 文  件   名: ConfigItem.java
 * 版         本 : (Anttribe) openeshop-base-api. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年12月6日
 */
package org.anttribe.openeshop.base.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 配置项
 * 
 * @author zhaoyong
 * @version 2015年12月6日
 */
public class ConfigItem implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1752665618888605351L;
    
    /**
     * 配置项名称
     */
    private String name;
    
    /**
     * key, 唯一
     */
    private String key;
    
    /**
     * 配置值
     */
    private String value;
    
    /**
     * 默认值
     */
    private String defaultValue;
    
    /**
     * 类型
     */
    private String type;
    
    /**
     * 配置信息
     */
    private List<ConfigItem> conf;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getKey()
    {
        return key;
    }
    
    public void setKey(String key)
    {
        this.key = key;
    }
    
    public String getValue()
    {
        return value;
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public List<ConfigItem> getConf()
    {
        return conf;
    }
    
    public void setConf(List<ConfigItem> conf)
    {
        this.conf = conf;
    }
    
    public String getDefaultValue()
    {
        return defaultValue;
    }
    
    public void setDefaultValue(String defaultValue)
    {
        this.defaultValue = defaultValue;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
}