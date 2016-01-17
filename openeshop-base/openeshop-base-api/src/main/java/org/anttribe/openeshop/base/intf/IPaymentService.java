/*
 * 文  件   名: IPaymentService.java
 * 版         本 : (Anttribe) openeshop-base-api. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月10日
 */
package org.anttribe.openeshop.base.intf;

import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.bo.PaymentBo;

/**
 * @author zhaoyong
 * @version 2016年1月10日
 */
public interface IPaymentService
{
    /**
     * 根据条件查询支付方式
     * 
     * @param criteria 查询条件
     * @return List<PaymentBo>
     */
    List<PaymentBo> listPayments(Map<String, Object> criteria);
    
    /**
     * 持久化数据
     * 
     * @param paymentBo PaymentBo
     */
    void persistentPayment(PaymentBo paymentBo);
    
    /**
     * 删除数据
     * 
     * @param paymentBo PaymentBo
     */
    void deletePayment(PaymentBo paymentBo);
    
}