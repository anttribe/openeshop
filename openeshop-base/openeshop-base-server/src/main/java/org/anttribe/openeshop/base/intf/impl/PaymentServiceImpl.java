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

import org.anttribe.openeshop.base.domain.Payment;
import org.anttribe.openeshop.base.intf.PaymentService;
import org.anttribe.openeshop.infra.constants.Keys;
import org.anttribe.openeshop.infra.domain.Pagination;
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
@Service
public class PaymentServiceImpl implements PaymentService
{
    
    private static Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);
    
    @SuppressWarnings("rawtypes")
    @Override
    public Pagination<Payment> listPayments(Map<String, Object> criteria, Pagination pagination)
    {
        logger.debug("list Payments by criteria[{}] and pagination [{}]", criteria, pagination);
        if (null == criteria)
        {
            criteria = new HashMap<String, Object>();
        }
        if (null != pagination)
        {
            criteria.put(Keys.KEY_PAGINATION, pagination);
        }
        
        return Payment.find(Payment.class, criteria, pagination);
    }
    
    @Override
    public List<Payment> listPayments(Map<String, Object> criteria)
    {
        logger.debug("list Payments by criteria[{}]", criteria);
        if (null == criteria)
        {
            criteria = new HashMap<String, Object>();
        }
        return Payment.find(Payment.class, criteria);
    }
    
    @Override
    public Payment loadPayment(Map<String, Object> criteria)
    {
        logger.debug("load Payment by criteria[{}]", criteria);
        if (null == criteria)
        {
            criteria = new HashMap<String, Object>();
        }
        List<Payment> payments = Payment.find(Payment.class, criteria);
        if (!CollectionUtils.isEmpty(payments))
        {
            return payments.get(0);
        }
        return null;
    }
    
    @Override
    public void persistentPayment(Payment payment)
    {
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
    public void deletePayment(Payment payment)
    {
        logger.debug("deleting payment from DB, param: payment[{}]", payment);
        
        if (null == payment)
        {
            logger.warn("deleting payment from DB, param payment is null.");
            throw new UnifyException(SystemErrorNo.PARAMETER_IS_NULL);
        }
        
        payment.remove();
    }
    
}