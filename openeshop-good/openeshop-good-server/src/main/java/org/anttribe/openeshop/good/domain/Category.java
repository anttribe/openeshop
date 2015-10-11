/*
 * 文  件   名: Category.java
 * 版         本 : (Anttribe) openeshop-good-server All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.good.domain;

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
     * 权重
     */
    private int weight;
    
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
            (new StringBuilder()).append(Category.class.getCanonicalName()).append(".queryByParent").toString();
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
    
    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    
    public Category getParent()
    {
        return parent;
    }
    
    public void setParent(Category parent)
    {
        this.parent = parent;
    }
}