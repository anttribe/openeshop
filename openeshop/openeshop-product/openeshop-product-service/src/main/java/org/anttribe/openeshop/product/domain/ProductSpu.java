/*
 * 文  件   名: ProductSpu.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.product.domain;

import org.anttribe.openeshop.product.type.ProductStatus;
import org.anttribe.openeshop.shop.domain.Shop;
import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class ProductSpu extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1670010805487267774L;
    
    /**
     * 商品名称
     */
    private String name;
    
    /**
     * 商品描述
     */
    private String description;
    
    /**
     * 描述文件
     */
    private String descHtmlFile;
    
    /**
     * 价格
     */
    private Double price;
    
    /**
     * 库存
     */
    private Integer stock;
    
    /**
     * 商品编码
     */
    private String productCode;
    
    /**
     * 商品状态
     */
    private ProductStatus status;
    
    /**
     * 所属店铺
     */
    private Shop shop;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getDescHtmlFile()
    {
        return descHtmlFile;
    }
    
    public void setDescHtmlFile(String descHtmlFile)
    {
        this.descHtmlFile = descHtmlFile;
    }
    
    public Double getPrice()
    {
        return price;
    }
    
    public void setPrice(Double price)
    {
        this.price = price;
    }
    
    public Integer getStock()
    {
        return stock;
    }
    
    public void setStock(Integer stock)
    {
        this.stock = stock;
    }
    
    public String getProductCode()
    {
        return productCode;
    }
    
    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }
    
    public ProductStatus getStatus()
    {
        return status;
    }
    
    public void setStatus(ProductStatus status)
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