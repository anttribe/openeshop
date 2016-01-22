/*
 * 文  件   名: ProductSku.java
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

/**
 * 商品SKU
 * 
 * @author zhaoyong
 * @version 1.0
 */
public class ProductSku extends MybatisAbstractEntity implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6788628741034083285L;
    
    /**
     * id
     */
    private Long id;
    
    /**
     * 商品spu
     */
    private Long productSpu;
    
    /**
     * 型号
     */
    private String model;
    
    /**
     * 价格
     */
    private Double price;
    
    /**
     * 库存
     */
    private Integer stock;
    
    /**
     * 销售量
     */
    private Integer salesNum;
    
    /**
     * 商品编码
     */
    private String productCode;
    
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
    public ProductSku()
    {
    }
    
    /**
     * <构造器>
     */
    public ProductSku(Long id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("ProductSku")
            .append("{")
            .append("id=")
            .append(this.getId())
            .append(',')
            .append("productSpu=")
            .append(this.getProductSpu())
            .append(',')
            .append("model=")
            .append(this.getModel())
            .append(',')
            .append("price=")
            .append(this.getPrice())
            .append(',')
            .append("stock=")
            .append(this.getStock())
            .append(',')
            .append("salesNum=")
            .append(this.getSalesNum())
            .append(',')
            .append("productCode=")
            .append(this.getProductCode())
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
    
    public Long getProductSpu()
    {
        return productSpu;
    }
    
    public void setProductSpu(Long productSpu)
    {
        this.productSpu = productSpu;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public void setModel(String model)
    {
        this.model = model;
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
    
    public Integer getSalesNum()
    {
        return salesNum;
    }
    
    public void setSalesNum(Integer salesNum)
    {
        this.salesNum = salesNum;
    }
    
    public String getProductCode()
    {
        return productCode;
    }
    
    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
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