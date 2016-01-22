/*
 * 文  件   名: ShopDistribution.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.shop.domain;

import java.io.Serializable;

import org.anttribe.openeshop.base.domain.Distribution;
import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * 店铺配送方式
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ShopDistribution extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -915235527745151709L;
    
    /**
     * id编号
     */
    private Long id;
    
    /**
     * 配送方式
     */
    private Distribution distribution;
    
    /**
     * 配置信息
     */
    private String config;
    
    /**
     * 是否启用
     */
    private String enabled;
    
    /**
     * 所属店铺
     */
    private Shop shop;
    
    /**
     * <默认构造器>
     */
    public ShopDistribution()
    {
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ShopDistribution")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("distribution=")
            .append(this.getDistribution())
            .append(',')
            .append("config=")
            .append(this.getConfig())
            .append(',')
            .append("enabled=")
            .append(this.getEnabled())
            .append(',')
            .append("shop=")
            .append(this.getShop())
            .append("}");
        return strB.toString();
    }
    
    public Long getId()
    {
        return this.id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    
    public String getConfig()
    {
        return this.config;
    }
    
    public void setConfig(String config)
    {
        this.config = config;
    }
    
    public String getEnabled()
    {
        return this.enabled;
    }
    
    public void setEnabled(String enabled)
    {
        this.enabled = enabled;
    }
    
    public Distribution getDistribution()
    {
        return distribution;
    }
    
    public void setDistribution(Distribution distribution)
    {
        this.distribution = distribution;
    }
    
    public Shop getShop()
    {
        return shop;
    }
    
    public void setShop(Shop shop)
    {
        this.shop = shop;
    }
    
}