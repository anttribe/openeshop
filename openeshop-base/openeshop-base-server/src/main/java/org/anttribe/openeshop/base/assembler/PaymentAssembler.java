/*
 * 文  件   名: PaymentAssembler.java
 * 版         本 : (Anttribe) openeshop-base-server. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月13日
 */
package org.anttribe.openeshop.base.assembler;

import java.util.ArrayList;
import java.util.List;

import org.anttribe.openeshop.base.bo.PaymentBo;
import org.anttribe.openeshop.base.entity.Payment;
import org.apache.commons.collections.CollectionUtils;

/**
 * @author zhaoyong
 * @version 2016年1月13日
 */
public class PaymentAssembler
{
    
    /**
     * 将entity对象转换为bo对象
     * 
     * @param payments List<Payment>
     * @return List<PaymentBo>
     */
    public static List<PaymentBo> toBo(List<Payment> payments)
    {
        List<PaymentBo> paymentBos = null;
        if (!CollectionUtils.isEmpty(payments))
        {
            paymentBos = new ArrayList<PaymentBo>();
            for (Payment entity : payments)
            {
                PaymentBo paymentBo = PaymentAssembler.toBo(entity);
                if (null == paymentBo)
                {
                    continue;
                }
                paymentBos.add(paymentBo);
            }
        }
        
        return paymentBos;
    }
    
    /**
     * 将entity对象转换为bo对象
     * 
     * @param payment
     * @return PaymentBo
     */
    public static PaymentBo toBo(Payment payment)
    {
        PaymentBo paymentBo = null;
        if (null != payment)
        {
            paymentBo = new PaymentBo();
            paymentBo.setId(payment.getId());
            paymentBo.setCode(payment.getCode());
            paymentBo.setIcon(payment.getIcon());
            paymentBo.setName(payment.getName());
            paymentBo.setConfig(payment.getConfig());
            paymentBo.setEnabled(payment.getEnabled());
        }
        return paymentBo;
    }
    
    /**
     * 将bo对象转换为entity对象
     * 
     * @param paymentBo
     * @return Payment
     */
    public static Payment toEntity(PaymentBo paymentBo)
    {
        Payment payment = null;
        if (null != paymentBo)
        {
            payment = new Payment();
            payment.setId(paymentBo.getId());
            payment.setCode(paymentBo.getCode());
            payment.setIcon(paymentBo.getIcon());
            payment.setName(paymentBo.getName());
            payment.setConfig(paymentBo.getConfig());
            payment.setEnabled(paymentBo.getEnabled());
        }
        return payment;
    }
    
}