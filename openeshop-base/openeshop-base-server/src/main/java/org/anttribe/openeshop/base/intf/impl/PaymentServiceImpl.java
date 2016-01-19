/*
 * 文  件   名: PaymentServiceImpl.java
 * 版         本 : (Anttribe) openeshop-base-server. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月13日
 */
package org.anttribe.openeshop.base.intf.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.assembler.PaymentAssembler;
import org.anttribe.openeshop.base.bo.PaymentBo;
import org.anttribe.openeshop.base.entity.Payment;
import org.anttribe.openeshop.base.intf.IPaymentService;
import org.anttribe.openeshop.infra.errorno.SystemErrorNo;
import org.anttribe.openeshop.infra.exception.UnifyException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhaoyong
 * @version 2016年1月13日
 */
@Service(version = "1.0")
public class PaymentServiceImpl implements IPaymentService
{
    
    private static Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);
    
    @Override
    public List<PaymentBo> listPayments(Map<String, Object> criteria)
    {
        logger.debug("list Payments by criteria[{}]", criteria);
        
        List<Payment> payments = Payment.find(Payment.class, criteria);
        return PaymentAssembler.toBo(payments);
    }
    
    @Override
    public void persistentPayment(PaymentBo paymentBo)
    {
        Payment payment = PaymentAssembler.toEntity(paymentBo);
        logger.debug("persistenting Payment to DB, param: payment[{}]", payment);
        
        // 参数校验
        if (null == payment)
        {
            logger.warn("persistenting payment to DB, param payment is null.");
            throw new UnifyException(SystemErrorNo.PARAMETER_IS_NULL);
        }
        if (StringUtils.isEmpty(payment.getName()) || StringUtils.isEmpty(payment.getCode()))
        {
            logger.warn("persistenting payment to DB, param payment's name or code is null.");
            throw new UnifyException(SystemErrorNo.PARAMETER_LOGIC_ERROR);
        }
        
        if (null == payment.getId())
        {
            payment.save();
            logger.debug("payment's id not there, then save new payment to DB, payment: {}", payment.getId());
            return;
        }
        
        Map<String, Object> criteria = new HashMap<String, Object>();
        criteria.put("id", payment.getId());
        List<Payment> tempPayments = Payment.find(Payment.class, criteria);
        if (CollectionUtils.isEmpty(tempPayments))
        {
            payment.save();
            logger.debug("payment not exist in DB, then save new payment to DB, payment: {}", payment.getId());
            return;
        }
        payment.update();
        logger.debug("payment exist in DB, then update payment info, payment: {}", payment.getId());
    }
    
    @Override
    public void deletePayment(PaymentBo paymentBo)
    {
        Payment payment = PaymentAssembler.toEntity(paymentBo);
        logger.debug("deleting payment from DB, param: payment[{}]", payment);
        
        if (null == payment)
        {
            logger.warn("deleting payment from DB, param payment is null.");
            throw new UnifyException(SystemErrorNo.PARAMETER_IS_NULL);
        }
        
        payment.remove();
    }
    
}