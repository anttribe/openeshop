/*
 * 文  件   名: ProductCategoryAssoci.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.product.domain;

import java.io.Serializable;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * 商品和分类关联关系表
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ProductCategoryAssoci extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6989991785564410342L;
    
    /**
     * id编号
     */
    private Long id;
    
    /**
     * 分类
     */
    private ShopProductCategory category;
    
    /**
     * 商品
     */
    private ProductSpu product;
    
    /**
     * <默认构造器>
     */
    public ProductCategoryAssoci()
    {
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ProductCategoryAssoci")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("category=")
            .append(this.getCategory())
            .append(',')
            .append("product=")
            .append(this.getProduct())
            .append("}");
        return strB.toString();
    }
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    
    public ShopProductCategory getCategory()
    {
        return category;
    }
    
    public void setCategory(ShopProductCategory category)
    {
        this.category = category;
    }
    
    public ProductSpu getProduct()
    {
        return product;
    }
    
    public void setProduct(ProductSpu product)
    {
        this.product = product;
    }
}