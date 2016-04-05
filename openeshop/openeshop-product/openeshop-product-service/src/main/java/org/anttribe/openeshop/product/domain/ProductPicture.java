/*
 * 文  件   名: ProductPicture.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.product.domain;

import org.anttribe.openeshop.product.type.ProductPictureType;
import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class ProductPicture extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7992351368910540168L;
    
    /**
     * 商品spu或sku
     */
    private String product;
    
    /**
     * 图片文件id
     */
    private String picture;
    
    /**
     * 图片类型, PRODUCTSPU或PRODUCTSKU
     */
    private ProductPictureType type;
    
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
    
    public ProductPictureType getType()
    {
        return type;
    }
    
    public void setType(ProductPictureType type)
    {
        this.type = type;
    }
    
}