/*
 * 文  件   名: CategoryBo.java
 * 版         本 : (Anttribe) openeshop-good-api All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.good.bo;

import java.io.Serializable;

/**
 * @author zhaoyong
 * @version 2015年10月11日
 */
public class CategoryBo implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7682197212619479549L;
    
    /**
     * id
     */
    private String id;
    
    /**
     * 分类名称
     */
    private String name;
    
    /**
     * 权重
     */
    private int weight;
    
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
    
    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
}