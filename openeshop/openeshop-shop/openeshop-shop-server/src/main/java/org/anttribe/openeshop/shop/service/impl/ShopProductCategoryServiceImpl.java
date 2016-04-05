/*
 * 文  件   名: ShopProductCategoryServiceImpl.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.shop.service.impl;

import org.anttribe.openeshop.shop.dao.IShopProductCategoryDao;
import org.anttribe.openeshop.shop.domain.ShopProductCategory;
import org.anttribe.openeshop.shop.service.IShopProductCategoryService;
import org.anttribe.vigor.infra.common.service.AbstractServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
@Service
public class ShopProductCategoryServiceImpl extends AbstractServiceImpl<IShopProductCategoryDao, ShopProductCategory>
    implements IShopProductCategoryService
{
}