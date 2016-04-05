/*
 * 文  件   名: ShopDistributionServiceImpl.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.service.impl;

import org.anttribe.openeshop.shop.dao.IShopDistributionDao;
import org.anttribe.openeshop.shop.domain.ShopDistribution;
import org.anttribe.openeshop.shop.service.IShopDistributionService;
import org.anttribe.vigor.infra.common.service.AbstractServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
@Service
public class ShopDistributionServiceImpl extends AbstractServiceImpl<IShopDistributionDao, ShopDistribution>
    implements IShopDistributionService
{
}