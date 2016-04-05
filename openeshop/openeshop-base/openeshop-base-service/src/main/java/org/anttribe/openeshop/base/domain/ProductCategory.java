/*
 * 文  件   名: ProductCategory.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.base.domain;

import org.anttribe.vigor.infra.persist.entity.TreeEntity;

/**
 * 商品分类
 * 
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class ProductCategory extends TreeEntity<ProductCategory>
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6415543053628892862L;
    
    /**
     * 分类名称
     */
    private String name;
    
    /**
     * 分类图标
     */
    private String picture;
    
    /**
     * 是否显示
     */
    private String isShow;
    
    /**
     * 树节点标记
     */
    private String treeCode;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getPicture()
    {
        return picture;
    }
    
    public void setPicture(String picture)
    {
        this.picture = picture;
    }
    
    public String getIsShow()
    {
        return isShow;
    }
    
    public void setIsShow(String isShow)
    {
        this.isShow = isShow;
    }
    
    public String getTreeCode()
    {
        return treeCode;
    }
    
    public void setTreeCode(String treeCode)
    {
        this.treeCode = treeCode;
    }
    
}