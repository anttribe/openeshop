/*
 * 文  件   名: PaymentFacadeImpl.java
 * 版         本 : (Anttribe) openeshop-console-facade. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月23日
 */
package org.anttribe.openeshop.console.facade.impl;

import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.domain.Payment;
import org.anttribe.openeshop.base.intf.PaymentService;
import org.anttribe.openeshop.console.facade.PaymentFacade;
import org.anttribe.openeshop.console.facade.assembler.PaymentAssembler;
import org.anttribe.openeshop.console.facade.dto.PaymentDTO;
import org.anttribe.openeshop.infra.domain.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaoyong
 * @version 2016年1月23日
 */
@Service
public class PaymentFacadeImpl implements PaymentFacade
{
    
    @Autowired
    private PaymentService paymentService;
    
    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public Pagination<PaymentDTO> listPayments(PaymentDTO paymentDTO, Pagination pagination)
    {
        if (null != paymentDTO)
        {
            Map<String, Object> criteria = paymentDTO.toCriteria();
            Pagination<Payment> tempPagination = paymentService.listPayments(criteria, pagination);
            if (null != pagination)
            {
                List<Payment> payments = tempPagination.getDatas();
                pagination.setDatas(PaymentAssembler.toDTO(payments));
            }
            return pagination;
        }
        return null;
    }
    
    @Override
    public PaymentDTO loadPayment(PaymentDTO paymentDTO)
    {
        if (null != paymentDTO)
        {
            Map<String, Object> criteria = paymentDTO.toCriteria();
            Payment payment = paymentService.loadPayment(criteria);
            
            return PaymentAssembler.toDTO(payment);
        }
        return null;
    }
    
    @Override
    public void saveOrUpdatePayment(PaymentDTO paymentDTO)
    {
        Payment payment = PaymentAssembler.toEntity(paymentDTO);
        if (null != payment)
        {
            this.paymentService.persistentPayment(payment);
        }
    }
    
}