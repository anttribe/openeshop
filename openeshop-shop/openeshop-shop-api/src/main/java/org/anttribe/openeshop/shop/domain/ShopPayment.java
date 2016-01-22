/*
 * 文  件   名: ShopPayment.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.shop.domain;

import java.io.Serializable;

import org.anttribe.openeshop.base.domain.Payment;
import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * 店铺支付方式
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ShopPayment extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -3270866208905502999L;
    
    /**
     * id
     */
    private Long id;
    
    /**
     * 支付方式
     */
    private Payment payment;
    
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
    public ShopPayment()
    {
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ShopPayment")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("payment=")
            .append(this.getPayment())
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
    
    public Payment getPayment()
    {
        return payment;
    }
    
    public void setPayment(Payment payment)
    {
        this.payment = payment;
    }
    
    public Shop getShop()
    {
        return shop;
    }
    
    public void setShop(Shop shop)
    {
        this.shop = shop;
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
    
}