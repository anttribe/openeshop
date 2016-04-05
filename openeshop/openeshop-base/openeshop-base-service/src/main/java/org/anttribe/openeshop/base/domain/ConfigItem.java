/*
 * 文  件   名: ConfigItem.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月2日
 */
package org.anttribe.openeshop.base.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhaoyong
 * @version 2016年4月2日
 */
public class ConfigItem implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 971681321728894671L;
    
    /**
     * 配置项名称
     */
    private String name;
    
    /**
     * 配置值
     */
    private String value;
    
    /**
     * key, 唯一
     */
    private String title;
    
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
    
    public String getValue()
    {
        return value;
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
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
    
    public List<ConfigItem> getConf()
    {
        return conf;
    }
    
    public void setConf(List<ConfigItem> conf)
    {
        this.conf = conf;
    }
    
}