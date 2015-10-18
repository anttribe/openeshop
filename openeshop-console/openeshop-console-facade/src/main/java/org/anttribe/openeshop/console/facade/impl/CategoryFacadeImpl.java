/*
 * 文  件   名: CategoryFacadeImpl.java
 * 版         本 : (Anttribe) openeshop-console-facade All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月13日
 */
package org.anttribe.openeshop.console.facade.impl;

import java.util.List;

import org.anttribe.openeshop.console.facade.CategoryFacade;
import org.anttribe.openeshop.console.facade.dto.CategoryDTO;
import org.anttribe.openeshop.product.bo.CategoryBo;
import org.anttribe.openeshop.product.intf.ICategoryService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @author zhaoyong
 * @version 2015年10月13日
 */
@Service
public class CategoryFacadeImpl implements CategoryFacade
{
    @Reference
    private ICategoryService categoryService;
    
    @Override
    public List<CategoryBo> listCategories(CategoryDTO categoryDTO)
    {
        String parent = (null == categoryDTO ? null : categoryDTO.getParent());
        return categoryService.listCategories(parent);
    }
    
}