/*
 * 文  件   名: ShopStatus.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.type;

/**
 * 店铺状态
 * 
 * @author zhaoyong
 * @version 2016年4月5日
 */
public enum ShopStatus
{
    UNAUTHERIZED("未认证"), WAITFORCHECK("待审核"), CHECNOTTHROUGH("审核不通过"), NORMALITY("正常"), CLOSE("关闭");
    
    private String name;
    
    private ShopStatus(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}