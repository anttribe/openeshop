/*
 * 文  件   名: ShopProductCategory.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.product.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;
import org.anttribe.openeshop.shop.domain.Shop;

/**
 * 店铺商品分类
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ShopProductCategory extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6131405405175182332L;
    
    /**
     * id
     */
    private Long id;
    
    /**
     * 分类名称
     */
    private String name;
    
    /**
     * 排序
     */
    private String ordinal;
    
    /**
     * 更新时间
     */
    private Timestamp updateTime;
    
    /**
     * 所属店铺
     */
    private Shop shop;
    
    /**
     * <默认构造器>
     */
    public ShopProductCategory()
    {
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ShopProductCategory")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("name=")
            .append(this.getName())
            .append(',')
            .append("ordinal=")
            .append(this.getOrdinal())
            .append(',')
            .append("updateTime=")
            .append(this.getUpdateTime())
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
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getOrdinal()
    {
        return this.ordinal;
    }
    
    public void setOrdinal(String ordinal)
    {
        this.ordinal = ordinal;
    }
    
    public Timestamp getUpdateTime()
    {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime)
    {
        this.updateTime = updateTime;
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