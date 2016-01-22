/*
 * 文  件   名: ProductSpu.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.product.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;
import org.anttribe.openeshop.shop.domain.Shop;

/**
 * 商品SPU
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ProductSpu extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -3802244608907654504L;
    
    /**
     * id
     */
    private Long id;
    
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
    private String status;
    
    /**
     * 所属店铺
     */
    private Shop shop;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 更新时间
     */
    private Timestamp updateTime;
    
    /**
     * <默认构造器>
     */
    public ProductSpu()
    {
    }
    
    /**
     * <构造器>
     */
    public ProductSpu(Long id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ProductSpu")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("name=")
            .append(this.getName())
            .append(',')
            .append("description=")
            .append(this.getDescription())
            .append(',')
            .append("descHtmlFile=")
            .append(this.getDescHtmlFile())
            .append(',')
            .append("price=")
            .append(this.getPrice())
            .append(',')
            .append("stock=")
            .append(this.getStock())
            .append(',')
            .append("productCode=")
            .append(this.getProductCode())
            .append(',')
            .append("status=")
            .append(this.getStatus())
            .append(',')
            .append("shopId=")
            .append(this.getShop())
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
        return id;
    }
    
    public void setId(Long id)
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
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
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
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    
    public Timestamp getUpdateTime()
    {
        return updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime)
    {
        this.updateTime = updateTime;
    }
    
}