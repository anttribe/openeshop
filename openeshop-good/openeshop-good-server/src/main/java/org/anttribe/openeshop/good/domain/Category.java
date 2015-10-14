/*
 * 文  件   名: Category.java
 * 版         本 : (Anttribe) openeshop-good-server All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.good.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.infra.domain.MybatisAbstractEntity;

/**
 * @author zhaoyong
 * @version 2015年10月11日
 */
public class Category extends MybatisAbstractEntity
{
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
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 数据更新时间
     */
    private Date updateTime;
    
    /**
     * 父分类
     */
    private Category parent;
    
    /**
     * 根据父分类id获取子分类信息
     * 
     * @param parent
     * @return List<Category>
     */
    public static List<Category> listByParent(String parent)
    {
        String statement =
            (new StringBuilder()).append(Category.class.getCanonicalName()).append(".queryByCriteria").toString();
        Map<String, Object> criteria = new HashMap<String, Object>();
        criteria.put("parent", parent);
        return getSqlSessionTemplate().selectList(statement, criteria);
    }
    
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
    
    public Category getParent()
    {
        return parent;
    }
    
    public void setParent(Category parent)
    {
        this.parent = parent;
    }
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
    
    public Date getUpdateTime()
    {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
}