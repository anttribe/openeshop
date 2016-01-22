/*
 * 文  件   名: ShopDistributionApplication.java
 * 版       本: Copyright (c) (Anttribe)openeshop v1.0. All rights reserved.
 * 描       述: <描述>
 * 修   改  人: zhaoyong(anshenglimin@163.com)
 * 修 改 时 间: 2016-01-16
 */
package org.anttribe.openeshop.shop.intf;

import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.shop.domain.ShopDistribution;

/**
 * ShopDistribution逻辑层处理接口
 * 
 * @author zhaoyong
 * @version 1.0
 */
public interface ShopDistributionService
{
    
    /**
     * 列表查询数据
     * 
     * @param criteria
     * @return
     */
    List<ShopDistribution> listShopDistributions(Map<String, Object> criteria);
    
    /**
     * 持久化数据
     * 
     * @param shopDistribution ShopDistribution
     */
    void persistentShopDistribution(ShopDistribution shopDistribution);
    
    /**
     * 删除数据
     * 
     * @param shopDistribution ShopDistribution
     */
    void deleteShopDistribution(ShopDistribution shopDistribution);
    
}