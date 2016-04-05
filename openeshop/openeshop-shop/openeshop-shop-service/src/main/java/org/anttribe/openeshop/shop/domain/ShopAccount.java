/*
 * 文  件   名: ShopAccount.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.domain;

import org.anttribe.openeshop.shop.type.ShopAccountStatus;
import org.anttribe.openeshop.shop.type.ShopAccountType;
import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * 店铺帐号
 * 
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class ShopAccount extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3474029183581172311L;
    
    /**
     * 店铺帐号用户
     */
    private String accountUser;
    
    /**
     * 帐号类型
     */
    private ShopAccountType type;
    
    /**
     * 店铺正好状态
     */
    private ShopAccountStatus status;
    
    /**
     * 所属店铺
     */
    private Shop shop;
    
    public String getAccountUser()
    {
        return accountUser;
    }
    
    public void setAccountUser(String accountUser)
    {
        this.accountUser = accountUser;
    }
    
    public ShopAccountType getType()
    {
        return type;
    }
    
    public void setType(ShopAccountType type)
    {
        this.type = type;
    }
    
    public ShopAccountStatus getStatus()
    {
        return status;
    }
    
    public void setStatus(ShopAccountStatus status)
    {
        this.status = status;
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