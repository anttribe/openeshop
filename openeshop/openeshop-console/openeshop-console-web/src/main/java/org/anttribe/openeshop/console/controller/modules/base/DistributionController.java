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

import org.anttribe.openeshop.base.domain.Distribution;
import org.anttribe.openeshop.base.service.IDistributionService;
import org.anttribe.vigor.infra.common.constants.Constants;
import org.anttribe.vigor.infra.common.constants.Keys;
import org.anttribe.vigor.infra.common.entity.Result;
import org.anttribe.vigor.infra.common.errorno.SystemErrorNo;
import org.anttribe.vigor.infra.common.exception.ServiceException;
import org.anttribe.vigor.infra.common.exception.UnifyException;
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
@RequestMapping("/distribution")
public class DistributionController extends AbstractController
{
    @Autowired
    private IDistributionService distributionService;
    
    @RequestMapping({"", "/", "/index"})
    public ModelAndView index(HttpServletRequest request, ModelAndView mv, Distribution distribution)
    {
        Map<String, Object> criteria = new HashMap<String, Object>();
        List<Distribution> distributions = distributionService.listEntities(criteria);
        mv.addObject(Keys.KEY_PAGE_DATA, distributions);
        
        mv.setViewName(Views.INDEX_VIEW);
        return mv;
    }
    
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, ModelAndView mv, Distribution distribution)
    {
        mv.setViewName(Views.ADD_VIEW);
        mv.addObject(Keys.KEY_PARAM, distribution);
        
        return mv;
    }
    
    @RequestMapping("/edit")
    public ModelAndView edit(HttpServletRequest request, ModelAndView mv, Distribution distribution)
    {
        if (null == distribution || null == distribution.getId())
        {
            throw new UnifyException(SystemErrorNo.DATA_NOT_EXIST_ERROR);
        }
        
        Map<String, Object> criteria = new HashMap<String, Object>();
        criteria.put("id", distribution.getId());
        distribution = distributionService.findEntity(criteria);
        if (null == distribution || null == distribution.getId())
        {
            throw new UnifyException(SystemErrorNo.DATA_NOT_EXIST_ERROR);
        }
        
        mv.setViewName(Views.EDIT_VIEW);
        mv.addObject(Keys.KEY_PARAM, distribution);
        return mv;
    }
    
    @ResponseBody
    @RequestMapping("/edit/exec")
    public Result<?> doEdit(HttpServletRequest request, Distribution distribution)
    {
        Result<?> result = new Result<String>();
        try
        {
            this.distributionService.persistentEntity(distribution);
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
    public Result<?> doRemove(HttpServletRequest request, Distribution distribution)
    {
        Result<?> result = new Result<String>();
        try
        {
            Map<String, Object> criteria = new HashMap<String, Object>();
            criteria.put("id", distribution.getId());
            distributionService.removeEntity(criteria);
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
        public static final String INDEX_VIEW = "/modules/base/distribution/list";
        
        /**
         * 列表视图
         */
        public static final String LIST_VIEW = "/modules/base/distribution/list";
        
        /**
         * 添加视图
         */
        public static final String ADD_VIEW = "/modules/base/distribution/edit";
        
        /**
         * 编辑视图
         */
        public static final String EDIT_VIEW = "/modules/base/distribution/edit";
    }
}