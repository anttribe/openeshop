/*
 * 文  件   名: DistributionAssembler.java
 * 版         本 : (Anttribe) openeshop-base-server. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月19日
 */
package org.anttribe.openeshop.base.assembler;

import java.util.ArrayList;
import java.util.List;

import org.anttribe.openeshop.base.bo.DistributionBo;
import org.anttribe.openeshop.base.entity.Distribution;
import org.apache.commons.collections.CollectionUtils;

/**
 * 
 * @author zhaoyong
 * @version 2016年1月19日
 */
public class DistributionAssembler
{
    
    /**
     * 将entity对象转换为bo对象
     * 
     * @param distributions List<Distribution>
     * @return List<DistributionBo>
     */
    public static List<DistributionBo> toBo(List<Distribution> distributions)
    {
        List<DistributionBo> distributionBos = null;
        if (!CollectionUtils.isEmpty(distributions))
        {
            distributionBos = new ArrayList<DistributionBo>();
            for (Distribution entity : distributions)
            {
                DistributionBo distributionBo = DistributionAssembler.toBo(entity);
                if (null == distributionBo)
                {
                    continue;
                }
                distributionBos.add(distributionBo);
            }
        }
        
        return distributionBos;
    }
    
    /**
     * 将entity对象转换为bo对象
     * 
     * @param distribution
     * @return DistributionBo
     */
    public static DistributionBo toBo(Distribution distribution)
    {
        DistributionBo distributionBo = null;
        if (null != distribution)
        {
            distributionBo = new DistributionBo();
            distributionBo.setId(distribution.getId());
            distributionBo.setCode(distribution.getCode());
            distributionBo.setIcon(distribution.getIcon());
            distributionBo.setName(distribution.getName());
            distributionBo.setConfig(distribution.getConfig());
            distributionBo.setEnabled(distribution.getEnabled());
        }
        return distributionBo;
    }
    
    /**
     * 将bo对象转换为entity对象
     * 
     * @param distributionBo
     * @return Distribution
     */
    public static Distribution toEntity(DistributionBo distributionBo)
    {
        Distribution distribution = null;
        if (null != distributionBo)
        {
            distribution = new Distribution();
            distribution.setId(distributionBo.getId());
            distribution.setCode(distributionBo.getCode());
            distribution.setIcon(distributionBo.getIcon());
            distribution.setName(distributionBo.getName());
            distribution.setConfig(distributionBo.getConfig());
            distribution.setEnabled(distributionBo.getEnabled());
        }
        return distribution;
    }
    
}