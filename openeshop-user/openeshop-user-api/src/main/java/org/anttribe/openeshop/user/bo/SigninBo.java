/*
 * 文  件   名: SigninBo.java
 * 版         本 : (Anttribe) openeshop-user-api All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.user.bo;

/**
 * @author zhaoyong
 * @version 2015年10月11日
 */
public class SigninBo
{
    /**
     * 用户账号 用户名/邮箱
     */
    private String userAccount;
    
    /**
     * 密码
     */
    private String password;
    
    /**
     * 自动登录
     */
    private boolean autologin;
    
    public String getUserAccount()
    {
        return userAccount;
    }
    
    public void setUserAccount(String userAccount)
    {
        this.userAccount = userAccount;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public boolean isAutologin()
    {
        return autologin;
    }
    
    public void setAutologin(boolean autologin)
    {
        this.autologin = autologin;
    }
}