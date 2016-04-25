/*
 * 文  件   名: SignupController.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月21日
 */
package org.anttribe.openeshop.merchant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.anttribe.vigor.defensor.domain.User;
import org.anttribe.vigor.infra.common.web.controller.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhaoyong
 * @version 2016年4月21日
 */
@Controller
public class SignupController extends AbstractController
{
    @RequestMapping("/signup")
    public ModelAndView signup(HttpServletRequest request, HttpServletResponse response, ModelAndView mv)
    {
        mv.setViewName(Views.SIGNIN_VIEW);
        return mv;
    }
    
    @RequestMapping("/signup/exec")
    public void doSignin(HttpServletRequest request, HttpServletResponse response, User user)
    {
    }
    
    class Views
    {
        
        public static final String SIGNIN_VIEW = "/signup";
        
    }
}