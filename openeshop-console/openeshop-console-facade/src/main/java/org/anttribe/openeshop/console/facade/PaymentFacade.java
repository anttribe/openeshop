/*
 * 文  件   名: PaymentFacade.java
 * 版         本 : (Anttribe) openeshop-console-facade. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月23日
 */
package org.anttribe.openeshop.console.facade;

import org.anttribe.openeshop.console.facade.dto.PaymentDTO;
import org.anttribe.openeshop.infra.domain.Pagination;

/**
 * @author zhaoyong
 * @version 2016年1月23日
 */
public interface PaymentFacade
{
    
    /**
     * 分页列表支付方式
     * 
     * @param paymentDTO
     * @param pagination
     * @return Pagination<PaymentDTO>
     */
    @SuppressWarnings("rawtypes")
    Pagination<PaymentDTO> listPayments(PaymentDTO paymentDTO, Pagination pagination);
    
    /**
     * 加载单个支付方式
     * 
     * @param paymentDTO PaymentDTO
     * @return PaymentDTO
     */
    PaymentDTO loadPayment(PaymentDTO paymentDTO);
    
    /**
     * 保存或更新支付方式数据
     * 
     * @param paymentDTO
     */
    void saveOrUpdatePayment(PaymentDTO paymentDTO);
    
}