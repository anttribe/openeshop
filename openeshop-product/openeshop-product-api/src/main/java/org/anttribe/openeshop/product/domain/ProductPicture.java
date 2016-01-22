/*
 * 文  件   名: ProductPicture.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.product.domain;

import java.io.Serializable;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * 商品图片
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ProductPicture extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7675145554771470005L;
    
    /**
     * id
     */
    private Long id;
    
    /**
     * 商品spu或sku
     */
    private String product;
    
    /**
     * 图片文件id
     */
    private String picture;
    
    /**
     * 排序
     */
    private String ordinal;
    
    /**
     * 图片类型, PRODUCTSPU或PRODUCTSKU
     */
    private String type;
    
    /**
     * <默认构造器>
     */
    public ProductPicture()
    {
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ProductPicture")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("product=")
            .append(this.getProduct())
            .append(',')
            .append("picture=")
            .append(this.getPicture())
            .append(',')
            .append("ordinal=")
            .append(this.getOrdinal())
            .append(',')
            .append("type=")
            .append(this.getType())
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
    
    public String getProduct()
    {
        return product;
    }
    
    public void setProduct(String product)
    {
        this.product = product;
    }
    
    public String getPicture()
    {
        return picture;
    }
    
    public void setPicture(String picture)
    {
        this.picture = picture;
    }
    
    public String getOrdinal()
    {
        return ordinal;
    }
    
    public void setOrdinal(String ordinal)
    {
        this.ordinal = ordinal;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
}