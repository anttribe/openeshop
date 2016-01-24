/*
 * 文  件   名: PaymentDTO.java
 * 版         本 : (Anttribe) openeshop-console-facade. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月23日
 */
package org.anttribe.openeshop.console.facade.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.domain.ConfigItem;

/**
 * @author zhaoyong
 * @version 2016年1月23日
 */
public class PaymentDTO
{
    
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
    private List<ConfigItem> configs;
    
    /**
     * 是否可用
     */
    private String enabled;
    
    /**
     * 转换成条件对象
     * 
     * @return Map<String, Object>
     */
    public Map<String, Object> toCriteria()
    {
        Map<String, Object> criteria = new HashMap<String, Object>();
        criteria.put("id", this.getId());
        criteria.put("name", this.getName());
        criteria.put("code", this.getCode());
        criteria.put("config", this.getConfig());
        criteria.put("icon", this.getIcon());
        criteria.put("enabled", this.getEnabled());
        criteria.put("configs", this.getConfigs());
        return criteria;
    }
    
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