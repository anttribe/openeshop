/*
 * 文  件   名: GoodCategoryController.java
 * 版         本 : (Anttribe) openeshop-console-web All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月13日
 */
package org.anttribe.openeshop.console.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.anttribe.openeshop.console.facade.CategoryFacade;
import org.anttribe.openeshop.console.facade.dto.CategoryDTO;
import org.anttribe.openeshop.good.bo.CategoryBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhaoyong
 * @version 2015年10月13日
 */
@Controller
@RequestMapping("/category")
public class GoodCategoryController
{
    @Autowired
    private CategoryFacade categoryFacade;
    
    @RequestMapping("list")
    public ModelAndView listCategories(HttpServletRequest request, HttpServletResponse response,
        @ModelAttribute CategoryDTO categoryDTO)
    {
        ModelAndView mv = new ModelAndView();
        List<CategoryBo> categories = categoryFacade.listCategories(categoryDTO);
        mv.addObject("categories", categories);
        mv.setViewName("/good/category/list");
        return mv;
    }
}