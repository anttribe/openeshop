/*
 * 文  件   名: DistributionBo.java
 * 版         本 : (Anttribe) openeshop-base-api. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年12月6日
 */
package org.anttribe.openeshop.base.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 配送方式
 * 
 * @author zhaoyong
 * @version 2015年12月6日
 */
public class DistributionBo implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2294981097117514938L;
    
    /**
     * id编号
     */
    private Long id;
    
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
    private List<ConfigItemBo> configs;
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    
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
    
    public List<ConfigItemBo> getConfigs()
    {
        return configs;
    }
    
    public void setConfigs(List<ConfigItemBo> configs)
    {
        this.configs = configs;
    }
    
}