/*
 * 文  件   名: ProductCategoryController.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月14日
 */
package org.anttribe.openeshop.console.controller.modules.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.anttribe.openeshop.base.domain.ProductCategory;
import org.anttribe.openeshop.base.service.IProductCategoryService;
import org.anttribe.vigor.infra.common.constants.Constants;
import org.anttribe.vigor.infra.common.constants.Keys;
import org.anttribe.vigor.infra.common.entity.Result;
import org.anttribe.vigor.infra.common.errorno.SystemErrorNo;
import org.anttribe.vigor.infra.common.exception.ServiceException;
import org.anttribe.vigor.infra.common.exception.UnifyException;
import org.anttribe.vigor.infra.common.type.YesOrNo;
import org.anttribe.vigor.infra.common.web.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhaoyong
 * @version 2016年4月14日
 */
@Controller
@RequestMapping("/productCategory")
public class ProductCategoryController extends AbstractController
{
    @Autowired
    private IProductCategoryService productCategoryService;
    
    @RequestMapping({"", "/", "/index"})
    public ModelAndView index(HttpServletRequest request, ModelAndView mv, ProductCategory category)
    {
        Map<String, Object> criteria = new HashMap<String, Object>();
        List<ProductCategory> categorys = productCategoryService.listEntities(criteria);
        mv.addObject(Keys.KEY_PAGE_DATA, categorys);
        
        mv.setViewName(Views.INDEX_VIEW);
        return mv;
    }
    
    @RequestMapping("/list/exec")
    @ResponseBody
    public Result<?> doList(HttpServletRequest request, ProductCategory category)
    {
        Result<List<ProductCategory>> result = new Result<List<ProductCategory>>();
        try
        {
            Map<String, Object> criteria = new HashMap<String, Object>();
            criteria.put("name", category.getName());
            criteria.put("parent", category.getParent());
            List<ProductCategory> productCategorys = productCategoryService.listEntities(criteria);
            result.setData(productCategorys);
            
            result.setResultCode(Constants.Common.DEFAULT_RESULT_CODE);
        }
        catch (ServiceException e)
        {
            result.setResultCode(e.getErrorNo());
        }
        return result;
    }
    
    @RequestMapping("/tool/selector")
    public String select(HttpServletRequest request, ProductCategory category)
    {
        return Views.SELECTOR_VIEW;
    }
    
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, ModelAndView mv, ProductCategory category)
    {
        mv.setViewName(Views.ADD_VIEW);
        
        if (null != category.getParent() && null != category.getParent().getId())
        {
            Map<String, Object> criteria = new HashMap<String, Object>();
            criteria.put("parent", category.getParent());
            ProductCategory parent = this.productCategoryService.findEntity(criteria);
            category.setParent(parent);
        }
        mv.addObject(Keys.KEY_PARAM, category);
        mv.addObject("yesOrNos", YesOrNo.values());
        
        return mv;
    }
    
    @RequestMapping("/edit")
    public ModelAndView edit(HttpServletRequest request, ModelAndView mv, ProductCategory category)
    {
        if (null == category || null == category.getId())
        {
            throw new UnifyException(SystemErrorNo.DATA_NOT_EXIST_ERROR);
        }
        
        Map<String, Object> criteria = new HashMap<String, Object>();
        criteria.put("id", category.getId());
        category = productCategoryService.findEntity(criteria);
        if (null == category || null == category.getId())
        {
            throw new UnifyException(SystemErrorNo.DATA_NOT_EXIST_ERROR);
        }
        
        mv.setViewName(Views.EDIT_VIEW);
        mv.addObject(Keys.KEY_PARAM, category);
        mv.addObject("yesOrNos", YesOrNo.values());
        return mv;
    }
    
    @ResponseBody
    @RequestMapping("/edit/exec")
    public Result<?> doEdit(HttpServletRequest request, ProductCategory category)
    {
        Result<?> result = new Result<String>();
        try
        {
            this.productCategoryService.persistentEntity(category);
            result.setResultCode(Constants.Common.DEFAULT_RESULT_CODE);
        }
        catch (ServiceException e)
        {
            result.setResultCode(e.getErrorNo());
        }
        return result;
    }
    
    @ResponseBody
    @RequestMapping("/remove/exec")
    public Result<?> doRemove(HttpServletRequest request, ProductCategory category)
    {
        Result<?> result = new Result<String>();
        try
        {
            Map<String, Object> criteria = new HashMap<String, Object>();
            criteria.put("id", category.getId());
            productCategoryService.removeEntity(criteria);
            result.setResultCode(Constants.Common.DEFAULT_RESULT_CODE);
        }
        catch (ServiceException e)
        {
            result.setResultCode(e.getErrorNo());
        }
        return result;
    }
    
    class Views
    {
        /**
         * index视图
         */
        public static final String INDEX_VIEW = "/modules/base/productCategory/list";
        
        /**
         * 列表视图
         */
        public static final String LIST_VIEW = "/modules/base/productCategory/list";
        
        /**
         * 添加视图
         */
        public static final String ADD_VIEW = "/modules/base/productCategory/edit";
        
        /**
         * 编辑视图
         */
        public static final String EDIT_VIEW = "/modules/base/productCategory/edit";
        
        /**
         * 选择器视图
         */
        public static final String SELECTOR_VIEW = "/modules/base/productCategory/tool.selector";
    }
}