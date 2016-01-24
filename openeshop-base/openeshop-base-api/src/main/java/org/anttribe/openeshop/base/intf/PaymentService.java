/*
 * 文  件   名: PaymentService.java
 * 版         本 : (Anttribe) openeshop-base-api. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月10日
 */
package org.anttribe.openeshop.base.intf;

import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.domain.Payment;
import org.anttribe.openeshop.infra.domain.Pagination;

/**
 * @author zhaoyong
 * @version 2016年1月10日
 */
public interface PaymentService
{
    
    /**
     * 根据分页条件查询支付方式
     * 
     * @param criteria
     * @param pagination
     * @return Pagination<Payment>
     */
    @SuppressWarnings("rawtypes")
    Pagination<Payment> listPayments(Map<String, Object> criteria, Pagination pagination);
    
    /**
     * 根据条件查询支付方式
     * 
     * @param criteria 查询条件
     * @return List<Payment>
     */
    List<Payment> listPayments(Map<String, Object> criteria);
    
    /**
     * 加载单条数据
     * 
     * @param criteria 查询条件
     * @return Payment
     */
    Payment loadPayment(Map<String, Object> criteria);
    
    /**
     * 持久化数据
     * 
     * @param payment Payment
     */
    void persistentPayment(Payment payment);
    
    /**
     * 删除数据
     * 
     * @param payment Payment
     */
    void deletePayment(Payment payment);
    
}