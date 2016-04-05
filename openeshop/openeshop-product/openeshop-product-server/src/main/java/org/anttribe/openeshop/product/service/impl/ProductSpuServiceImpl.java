/*
 * 文  件   名: ProductSpuServiceImpl.java
 * 版         本 : Copyright © 2016 Anttribe. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年4月5日
 */
package org.anttribe.openeshop.product.service.impl;

import org.anttribe.openeshop.product.dao.IProductSpuDao;
import org.anttribe.openeshop.product.domain.ProductSpu;
import org.anttribe.openeshop.product.service.IProductSpuService;
import org.anttribe.vigor.infra.common.service.AbstractServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhaoyong
 * @version 2016年4月5日
 */
@Service
public class ProductSpuServiceImpl extends AbstractServiceImpl<IProductSpuDao, ProductSpu> implements IProductSpuService
{
}