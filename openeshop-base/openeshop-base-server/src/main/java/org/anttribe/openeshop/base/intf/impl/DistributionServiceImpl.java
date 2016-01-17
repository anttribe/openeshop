/*
 * 文  件   名: DistributionServiceImpl.java
 * 版         本 : (Anttribe) openeshop-base-server. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月13日
 */
package org.anttribe.openeshop.base.intf.impl;

import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.bo.DistributionBo;
import org.anttribe.openeshop.base.intf.IDistributionService;

/**
 * @author zhaoyong
 * @version 2016年1月13日
 */
public class DistributionServiceImpl implements IDistributionService
{
    
    @Override
    public List<DistributionBo> listDistributions(Map<String, Object> criteria)
    {
        return null;
    }

    @Override
    public void persistentDistribution(DistributionBo distributionBo)
    {
    }

    @Override
    public void deleteDistribution(DistributionBo distributionBo)
    {
    }
    
}