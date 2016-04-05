/*
 * 文  件   名: ShopDistribution.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.domain;

import org.anttribe.openeshop.base.domain.Distribution;
import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class ShopDistribution extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2275029901554188229L;
    
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
    
    public Distribution getDistribution()
    {
        return distribution;
    }
    
    public void setDistribution(Distribution distribution)
    {
        this.distribution = distribution;
    }
    
    public String getConfig()
    {
        return config;
    }
    
    public void setConfig(String config)
    {
        this.config = config;
    }
    
    public String getEnabled()
    {
        return enabled;
    }
    
    public void setEnabled(String enabled)
    {
        this.enabled = enabled;
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