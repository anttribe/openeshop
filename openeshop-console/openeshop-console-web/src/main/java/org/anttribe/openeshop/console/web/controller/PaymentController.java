/*
 * 文  件   名: PaymentController.java
 * 版         本 : (Anttribe) openeshop-console-web. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月22日
 */
package org.anttribe.openeshop.console.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.anttribe.openeshop.console.facade.PaymentFacade;
import org.anttribe.openeshop.console.facade.dto.PaymentDTO;
import org.anttribe.openeshop.infra.constants.Constants;
import org.anttribe.openeshop.infra.constants.Keys;
import org.anttribe.openeshop.infra.domain.Pagination;
import org.anttribe.openeshop.infra.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * 支付方式处理
 * 
 * @author zhaoyong
 * @version 2016年1月22日
 */
@Controller
@RequestMapping("/payment")
public class PaymentController
{
    
    private static Logger logger = LoggerFactory.getLogger(PaymentController.class);
    
    @Autowired
    private PaymentFacade paymentFacade;
    
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request, ModelAndView mv, PaymentDTO paymentDTO,
        Pagination<PaymentDTO> pagination)
    {
        return this.list(request, mv, paymentDTO, pagination);
    }
    
    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request, ModelAndView mv, PaymentDTO paymentDTO,
        Pagination<PaymentDTO> pagination)
    {
        pagination = paymentFacade.listPayments(paymentDTO, pagination);
        
        mv.setViewName("/payment/list");
        mv.addObject(Keys.KEY_PARAM, paymentDTO);
        mv.addObject(Keys.KEY_PAGE, pagination);
        if (null != pagination)
        {
            mv.addObject(Keys.KEY_PAGE_DATA, pagination.getDatas());
        }
        return mv;
    }
    
    @RequestMapping("/list/exec")
    @ResponseBody
    public Result<Pagination<PaymentDTO>> list(HttpServletRequest request, PaymentDTO paymentDTO,
        Pagination<PaymentDTO> pagination)
    {
        pagination = paymentFacade.listPayments(paymentDTO, pagination);
        
        Result<Pagination<PaymentDTO>> result = new Result<Pagination<PaymentDTO>>();
        result.setData(pagination);
        result.setResultCode(Constants.DEFAULT_RESULT_SUCCESS);
        return result;
    }
    
    @RequestMapping("/add")
    public String add(HttpServletRequest request)
    {
        return "/payment/edit";
    }
    
    @RequestMapping("/edit")
    public ModelAndView edit(HttpServletRequest request, ModelAndView mv, PaymentDTO paymentDTO)
    {
        // 加载单个对象
        paymentDTO = this.paymentFacade.loadPayment(paymentDTO);
        if (null != paymentDTO)
        {
            mv.setViewName("/payment/edit");
            mv.addObject(Keys.KEY_PAGE_DATA, paymentDTO);
        }
        return mv;
    }
    
    @RequestMapping("/edit/exec")
    @ResponseBody
    public Result<?> doEdit(HttpServletRequest request,
        @RequestParam(required = false, value = "file") MultipartFile file, PaymentDTO paymentDTO)
    {
        Result<PaymentDTO> result = new Result<PaymentDTO>();
        if (null != paymentDTO)
        {
            this.paymentFacade.saveOrUpdatePayment(paymentDTO);
            
            // TODO:删除原图片
            
            result.setData(paymentDTO);
            result.setResultCode(Constants.DEFAULT_RESULT_SUCCESS);
        }
        return result;
    }
    
}