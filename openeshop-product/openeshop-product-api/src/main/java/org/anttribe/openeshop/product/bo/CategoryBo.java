/*
 * 文  件   名: CategoryBo.java
 * 版         本 : (Anttribe) openeshop-good-api All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.product.bo;

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
     * 序号
     */
    private int ordinal;
    
    /**
     * 父分类
     */
    private CategoryBo parent;
    
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
    
    public int getOrdinal()
    {
        return ordinal;
    }
    
    public void setOrdinal(int ordinal)
    {
        this.ordinal = ordinal;
    }
    
    public CategoryBo getParent()
    {
        return parent;
    }
    
    public void setParent(CategoryBo parent)
    {
        this.parent = parent;
    }
}