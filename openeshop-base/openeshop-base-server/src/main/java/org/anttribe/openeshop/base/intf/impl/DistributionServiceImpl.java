/*
 * 文  件   名: DistributionServiceImpl.java
 * 版         本 : (Anttribe) openeshop-base-server. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月13日
 */
package org.anttribe.openeshop.base.intf.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.anttribe.openeshop.base.assembler.DistributionAssembler;
import org.anttribe.openeshop.base.bo.DistributionBo;
import org.anttribe.openeshop.base.entity.Distribution;
import org.anttribe.openeshop.base.entity.Payment;
import org.anttribe.openeshop.base.intf.IDistributionService;
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
@Service(version = "1.0")
public class DistributionServiceImpl implements IDistributionService
{
    
    private static Logger logger = LoggerFactory.getLogger(DistributionServiceImpl.class);
    
    @Override
    public List<DistributionBo> listDistributions(Map<String, Object> criteria)
    {
        logger.debug("listing Distributions refer to criteria, param: [{}]", criteria);
        
        if (null == criteria)
        {
            criteria = new HashMap<String, Object>();
        }
        List<Distribution> distributions = Distribution.find(Distribution.class, criteria);
        return DistributionAssembler.toBo(distributions);
    }
    
    @Override
    public void persistentDistribution(DistributionBo distributionBo)
    {
        Distribution distribution = DistributionAssembler.toEntity(distributionBo);
        logger.debug("persistenting Distribution to DB, distribution: payment[{}]", distribution);
        
        // 参数校验
        if (null == distribution)
        {
            logger.warn("persistenting distribution to DB, param distribution is null.");
            throw new UnifyException(SystemErrorNo.PARAMETER_IS_NULL);
        }
        if (StringUtils.isEmpty(distribution.getName()) || StringUtils.isEmpty(distribution.getCode()))
        {
            logger.warn("persistenting distribution to DB, param distribution's name or code is null.");
            throw new UnifyException(SystemErrorNo.PARAMETER_LOGIC_ERROR);
        }
        
        if (null == distribution.getId())
        {
            distribution.save();
            logger.debug("distribution's id not there, then save new distribution to DB, distribution: {}",
                distribution.getId());
            return;
        }
        
        Map<String, Object> criteria = new HashMap<String, Object>();
        criteria.put("id", distribution.getId());
        List<Payment> tempPayments = Payment.find(Payment.class, criteria);
        if (CollectionUtils.isEmpty(tempPayments))
        {
            distribution.save();
            logger.debug("distribution not exist in DB, then save new distribution to DB, distribution: {}",
                distribution.getId());
            return;
        }
        distribution.update();
        logger.debug("distribution exist in DB, then update distribution info, distribution: {}", distribution.getId());
    }
    
    @Override
    public void deleteDistribution(DistributionBo distributionBo)
    {
        Distribution distribution = DistributionAssembler.toEntity(distributionBo);
        logger.debug("deleting distribution from DB, param: distribution[{}]", distribution);
        
        if (null == distribution)
        {
            logger.warn("deleting distribution from DB, param distribution is null.");
            throw new UnifyException(SystemErrorNo.PARAMETER_IS_NULL);
        }
        
        distribution.remove();
    }
    
}