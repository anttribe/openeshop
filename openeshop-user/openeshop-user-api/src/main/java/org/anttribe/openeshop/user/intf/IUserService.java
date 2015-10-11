/*
 * 文  件   名: IUserService.java
 * 版         本 : (Anttribe) openeshop-user-api All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月10日
 */
package org.anttribe.openeshop.user.intf;

import org.anttribe.openeshop.user.bo.SigninBo;
import org.anttribe.openeshop.user.bo.UserBo;

/**
 * @author zhaoyong
 * @version 2015年10月10日
 */
public interface IUserService
{
    /**
     * 用户登录
     * 
     * @param signinBo SigninBo
     * @return UserBo
     */
    UserBo userSignin(SigninBo signinBo);
}