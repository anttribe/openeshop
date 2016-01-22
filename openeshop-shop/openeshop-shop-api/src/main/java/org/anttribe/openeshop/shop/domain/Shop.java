/*
 * 文  件   名: Shop.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.shop.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * 店铺信息
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class Shop extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8975080739250174574L;
    
    /**
     * id
     */
    private Long id;
    
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
    private ShopCategory category;
    
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
    private String status;
    
    /**
     * 店铺类型
     */
    private String type;
    
    /**
     * 开始营业时间
     */
    private String startBusinessTime;
    
    /**
     * 结束营业时间
     */
    private String endBusinessTime;
    
    /**
     * 创建时间
     */
    private Timestamp createTime;
    
    /**
     * 更新时间
     */
    private Timestamp updateTime;
    
    /**
     * <默认构造器>
     */
    public Shop()
    {
    }
    
    /**
     * <构造器>
     * 
     * @param id
     */
    public Shop(Long id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("Shop")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("name=")
            .append(this.getName())
            .append(',')
            .append("avatar=")
            .append(this.getAvatar())
            .append(',')
            .append("phone=")
            .append(this.getPhone())
            .append(',')
            .append("grade=")
            .append(this.getGrade())
            .append(',')
            .append("notice=")
            .append(this.getNotice())
            .append(',')
            .append("category=")
            .append(this.getCategory())
            .append(',')
            .append("address=")
            .append(this.getAddress())
            .append(',')
            .append("latitude=")
            .append(this.getLatitude())
            .append(',')
            .append("longitude=")
            .append(this.getLongitude())
            .append(',')
            .append("location=")
            .append(this.getLocation())
            .append(',')
            .append("merchant=")
            .append(this.getMerchant())
            .append(',')
            .append("status=")
            .append(this.getStatus())
            .append(',')
            .append("type=")
            .append(this.getType())
            .append(',')
            .append("startBusinessTime=")
            .append(this.getStartBusinessTime())
            .append(',')
            .append("endBusinessTime=")
            .append(this.getEndBusinessTime())
            .append(',')
            .append("createTime=")
            .append(this.getCreateTime())
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
    
    public String getAvatar()
    {
        return this.avatar;
    }
    
    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getGrade()
    {
        return this.grade;
    }
    
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    public String getNotice()
    {
        return this.notice;
    }
    
    public void setNotice(String notice)
    {
        this.notice = notice;
    }
    
    public ShopCategory getCategory()
    {
        return category;
    }
    
    public void setCategory(ShopCategory category)
    {
        this.category = category;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getLatitude()
    {
        return this.latitude;
    }
    
    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }
    
    public String getLongitude()
    {
        return this.longitude;
    }
    
    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }
    
    public String getLocation()
    {
        return this.location;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public String getMerchant()
    {
        return this.merchant;
    }
    
    public void setMerchant(String merchant)
    {
        this.merchant = merchant;
    }
    
    public String getStatus()
    {
        return this.status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getStartBusinessTime()
    {
        return this.startBusinessTime;
    }
    
    public void setStartBusinessTime(String startBusinessTime)
    {
        this.startBusinessTime = startBusinessTime;
    }
    
    public String getEndBusinessTime()
    {
        return this.endBusinessTime;
    }
    
    public void setEndBusinessTime(String endBusinessTime)
    {
        this.endBusinessTime = endBusinessTime;
    }
    
    public Timestamp getCreateTime()
    {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime)
    {
        this.createTime = createTime;
    }
    
    public Timestamp getUpdateTime()
    {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime)
    {
        this.updateTime = updateTime;
    }
    
}