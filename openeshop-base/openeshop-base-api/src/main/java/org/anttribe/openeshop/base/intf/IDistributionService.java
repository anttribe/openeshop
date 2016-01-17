/*
 * 文  件   名: IDistributionService.java
 * 版         本 : (Anttribe) openeshop-base-api. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月13日
 */
package org.anttribe.openeshop.base.intf;

import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.bo.DistributionBo;

/**
 * @author zhaoyong
 * @version 2016年1月13日
 */
public interface IDistributionService
{
    /**
     * 根据条件查询配送方式
     * 
     * @param criteria 查询条件
     * @return List<Distribution>
     */
    List<DistributionBo> listDistributions(Map<String, Object> criteria);
    
    /**
     * 持久化数据
     * 
     * @param distributionBo DistributionBo
     */
    void persistentDistribution(DistributionBo distributionBo);
    
    /**
     * 删除数据
     * 
     * @param distributionBo DistributionBo
     */
    void deleteDistribution(DistributionBo distributionBo);
    
}