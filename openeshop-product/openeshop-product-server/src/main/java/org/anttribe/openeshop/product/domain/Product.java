/*
 * 文  件   名: Product.java
 * 版         本 : (Anttribe) openeshop-good-server All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月18日
 */
package org.anttribe.openeshop.product.domain;

import java.util.Date;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * @author zhaoyong
 * @version 2015年10月18日
 */
public class Product extends MybatisAbstractEntity
{
    /**
     * id编号
     */
    private String id;
    
    /**
     * 产品名称, 标题
     */
    private String name;
    
    /**
     * 简述
     */
    private String brief;
    
    /**
     * 商品描述，图文详情
     */
    private String description;
    
    /**
     * 产品分类
     */
    private Category category;
    
    /**
     * 产品状态
     */
    private ProductStatus status;
    
    /**
     * 产品类型
     */
    private ProductType type;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 数据更新时间
     */
    private Date updateTime;
    
    /**
     * 产品上下架时间
     */
    private Date putawayTime;
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
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
    
    public String getBrief()
    {
        return brief;
    }
    
    public void setBrief(String brief)
    {
        this.brief = brief;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public ProductStatus getStatus()
    {
        return status;
    }
    
    public void setStatus(ProductStatus status)
    {
        this.status = status;
    }
    
    public ProductType getType()
    {
        return type;
    }
    
    public void setType(ProductType type)
    {
        this.type = type;
    }
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    
    public Date getUpdateTime()
    {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
    
    public Date getPutawayTime()
    {
        return putawayTime;
    }
    
    public void setPutawayTime(Date putawayTime)
    {
        this.putawayTime = putawayTime;
    }
}