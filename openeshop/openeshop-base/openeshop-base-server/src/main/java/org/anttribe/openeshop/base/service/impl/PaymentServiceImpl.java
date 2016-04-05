/*
 * 文  件   名: PaymentServiceImpl.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月3日
 */
package org.anttribe.openeshop.base.service.impl;

import org.anttribe.openeshop.base.dao.IPaymentDao;
import org.anttribe.openeshop.base.domain.Payment;
import org.anttribe.openeshop.base.service.IPaymentService;
import org.anttribe.vigor.infra.common.service.AbstractServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhaoyong
 * @version 2016年4月3日
 */
@Service
public class PaymentServiceImpl extends AbstractServiceImpl<IPaymentDao, Payment> implements IPaymentService
{
}