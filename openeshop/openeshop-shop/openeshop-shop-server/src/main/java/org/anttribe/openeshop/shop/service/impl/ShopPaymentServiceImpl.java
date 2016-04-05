/*
 * 文  件   名: ShopPaymentServiceImpl.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.service.impl;

import org.anttribe.openeshop.shop.dao.IShopPaymentDao;
import org.anttribe.openeshop.shop.domain.ShopPayment;
import org.anttribe.openeshop.shop.service.IShopPaymentService;
import org.anttribe.vigor.infra.common.service.AbstractServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
@Service
public class ShopPaymentServiceImpl extends AbstractServiceImpl<IShopPaymentDao, ShopPayment>
    implements IShopPaymentService
{
}