/*
 * 文  件   名: ShopAccount.java
 * 版         本 : (Anttribe) openeshop-shop-api. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月22日
 */
package org.anttribe.openeshop.shop.domain;

import java.io.Serializable;
import java.util.Date;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * 店铺帐号信息
 * 
 * @author zhaoyong
 * @version 2016年1月22日
 */
public class ShopAccount extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6546132845837144549L;
    
    /**
     * id
     */
    private Long id;
    
    /**
     * 店铺帐号用户
     */
    private Long user;
    
    /**
     * 帐号类型
     */
    private String type;
    
    /**
     * 所属店铺
     */
    private Shop shop;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    
    public Long getUser()
    {
        return user;
    }
    
    public void setUser(Long user)
    {
        this.user = user;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public Shop getShop()
    {
        return shop;
    }
    
    public void setShop(Shop shop)
    {
        this.shop = shop;
    }
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    
}