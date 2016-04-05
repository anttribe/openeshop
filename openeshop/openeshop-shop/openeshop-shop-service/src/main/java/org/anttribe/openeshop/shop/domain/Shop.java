/*
 * 文  件   名: Shop.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.domain;

import org.anttribe.openeshop.base.domain.ProductCategory;
import org.anttribe.openeshop.shop.type.ShopStatus;
import org.anttribe.openeshop.shop.type.ShopType;
import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class Shop extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -299178949375107870L;
    
    /**
     * 店铺名称
     */
    private String name;
    
    /**
     * 店铺头像
     */
    private String avatar;
    
    /**
     * 联系电话
     */
    private String phone;
    
    /**
     * 店铺等级
     */
    private String grade;
    
    /**
     * 店铺公告
     */
    private String notice;
    
    /**
     * 主营类目
     */
    private ProductCategory category;
    
    /**
     * 店铺地址
     */
    private String address;
    
    /**
     * 位置纬度
     */
    private String latitude;
    
    /**
     * 位置经度
     */
    private String longitude;
    
    /**
     * 位置其他信息
     */
    private String location;
    
    /**
     * 店主用户
     */
    private String merchant;
    
    /**
     * 店铺状态
     */
    private ShopStatus status;
    
    /**
     * 店铺类型
     */
    private ShopType type;
    
    /**
     * 营业时间
     */
    private String businessTime;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAvatar()
    {
        return avatar;
    }
    
    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    public String getNotice()
    {
        return notice;
    }
    
    public void setNotice(String notice)
    {
        this.notice = notice;
    }
    
    public ProductCategory getCategory()
    {
        return category;
    }
    
    public void setCategory(ProductCategory category)
    {
        this.category = category;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getLatitude()
    {
        return latitude;
    }
    
    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }
    
    public String getLongitude()
    {
        return longitude;
    }
    
    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public String getMerchant()
    {
        return merchant;
    }
    
    public void setMerchant(String merchant)
    {
        this.merchant = merchant;
    }
    
    public ShopStatus getStatus()
    {
        return status;
    }
    
    public void setStatus(ShopStatus status)
    {
        this.status = status;
    }
    
    public ShopType getType()
    {
        return type;
    }
    
    public void setType(ShopType type)
    {
        this.type = type;
    }
    
    public String getBusinessTime()
    {
        return businessTime;
    }
    
    public void setBusinessTime(String businessTime)
    {
        this.businessTime = businessTime;
    }
    
}