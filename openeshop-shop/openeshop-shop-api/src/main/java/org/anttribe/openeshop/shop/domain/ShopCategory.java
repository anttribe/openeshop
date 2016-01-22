/*
 * 文  件   名: ShopCategory.java
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
 * 店铺分类, 主营类目
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ShopCategory extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8977443929866785009L;
    
    /**
     * 编号id
     */
    private Long id;
    
    /**
     * 分类名称
     */
    private String name;
    
    /**
     * 分类图标
     */
    private String picture;
    
    /**
     * 父分类
     */
    private ShopCategory parent;
    
    /**
     * 序号
     */
    private String sortNo;
    
    /**
     * 树节点编号
     */
    private String treeCode;
    
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
    public ShopCategory()
    {
    }
    
    /**
     * <构造器>
     */
    public ShopCategory(Long id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ShopCategory")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("name=")
            .append(this.getName())
            .append(',')
            .append("picture=")
            .append(this.getPicture())
            .append(',')
            .append("parent=")
            .append(this.getParent())
            .append(',')
            .append("sortNo=")
            .append(this.getSortNo())
            .append(',')
            .append("treeCode=")
            .append(this.getTreeCode())
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
    
    public String getPicture()
    {
        return this.picture;
    }
    
    public void setPicture(String picture)
    {
        this.picture = picture;
    }
    
    public ShopCategory getParent()
    {
        return parent;
    }
    
    public void setParent(ShopCategory parent)
    {
        this.parent = parent;
    }
    
    public String getSortNo()
    {
        return this.sortNo;
    }
    
    public void setSortNo(String sortNo)
    {
        this.sortNo = sortNo;
    }
    
    public String getTreeCode()
    {
        return this.treeCode;
    }
    
    public void setTreeCode(String treeCode)
    {
        this.treeCode = treeCode;
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