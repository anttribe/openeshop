/*
 * 文  件   名: CategoryFacade.java
 * 版         本 : (Anttribe) openeshop-console-facade All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月13日
 */
package org.anttribe.openeshop.console.facade;

import java.util.List;

import org.anttribe.openeshop.console.facade.dto.CategoryDTO;
import org.anttribe.openeshop.product.bo.CategoryBo;

/**
 * @author zhaoyong
 * @version 2015年10月13日
 */
public interface CategoryFacade
{
    /**
     * 列表分类信息
     * 
     * @param categoryDTO 分类参数信息
     * @return List<CategoryBo>
     */
    List<CategoryBo> listCategories(CategoryDTO categoryDTO);
}