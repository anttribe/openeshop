/*
 * 文  件   名: CategoryAssembler.java
 * 版         本 : (Anttribe) openeshop-good-server All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.product.assembler;

import java.util.ArrayList;
import java.util.List;

import org.anttribe.openeshop.product.bo.CategoryBo;
import org.anttribe.openeshop.product.domain.Category;
import org.apache.commons.collections.CollectionUtils;

/**
 * @author zhaoyong
 * @version 2015年10月11日
 */
public class CategoryAssembler
{
    /**
     * 转换为BO对象
     * 
     * @param category
     * @return CategoryBo
     */
    public static CategoryBo toBo(Category category)
    {
        if (null == category)
        {
            return null;
        }
        
        CategoryBo bo = new CategoryBo();
        bo.setId(category.getId());
        bo.setName(category.getName());
        bo.setOrdinal(category.getOrdinal());
        return bo;
    }
    
    /**
     * 转换为BO对象
     * 
     * @param category
     * @return CategoryBo
     */
    public static List<CategoryBo> toBo(List<Category> categories)
    {
        if (!CollectionUtils.isEmpty(categories))
        {
            List<CategoryBo> bos = new ArrayList<CategoryBo>();
            for (Category category : categories)
            {
                if (null == category)
                {
                    continue;
                }
                bos.add(CategoryAssembler.toBo(category));
            }
        }
        return null;
    }
}