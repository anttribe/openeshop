/*
 * 文  件   名: ICategoryService.java
 * 版         本 : (Anttribe) openeshop-good-api All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.product.intf;

import java.util.List;

import org.anttribe.openeshop.product.bo.CategoryBo;

/**
 * @author zhaoyong
 * @version 2015年10月11日
 */
public interface ICategoryService
{
    /**
     * 列表分类信息
     * 
     * @param parent 父分类
     * @return List<CategoryBo>
     */
    List<CategoryBo> listCategories(String parent);
    
    /**
     * 保存分类信息
     * 
     * @param category
     */
    void saveCategory(CategoryBo category);
    
    /**
     * 保存分类信息
     * 
     * @param category
     */
    void updateCategory(CategoryBo category);
    
    /**
     * 删除分类信息
     */
    void deleteCategory(CategoryBo category);
}