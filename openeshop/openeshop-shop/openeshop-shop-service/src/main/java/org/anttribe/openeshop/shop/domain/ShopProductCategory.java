/*
 * 文  件   名: ShopProductCategory.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.domain;

import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * 店铺商品分类
 * 
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class ShopProductCategory extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6494492571477190354L;
    
    /**
     * 分类名称
     */
    private String name;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
}