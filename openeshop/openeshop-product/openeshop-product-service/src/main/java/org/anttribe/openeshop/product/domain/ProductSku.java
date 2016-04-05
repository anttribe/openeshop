/*
 * 文  件   名: ProductSku.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.product.domain;

import org.anttribe.vigor.infra.persist.entity.Entity;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
public class ProductSku extends Entity
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2359180611592861121L;
    
    /**
     * 商品spu
     */
    private ProductSpu productSpu;
    
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
    
    public ProductSpu getProductSpu()
    {
        return productSpu;
    }
    
    public void setProductSpu(ProductSpu productSpu)
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
    
}