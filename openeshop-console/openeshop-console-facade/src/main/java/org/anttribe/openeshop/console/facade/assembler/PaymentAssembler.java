/*
 * 文  件   名: PaymentAssembler.java
 * 版         本 : (Anttribe) openeshop-console-facade. All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2016年1月23日
 */
package org.anttribe.openeshop.console.facade.assembler;

import java.util.ArrayList;
import java.util.List;

import org.anttribe.openeshop.base.domain.Payment;
import org.anttribe.openeshop.console.facade.dto.PaymentDTO;
import org.apache.commons.collections.CollectionUtils;

/**
 * @author zhaoyong
 * @version 2016年1月23日
 */
public class PaymentAssembler
{
    
    /**
     * 转换为DTO对象
     * 
     * @param entity
     * @return PaymentDTO
     */
    public static PaymentDTO toDTO(Payment entity)
    {
        PaymentDTO dto = null;
        if (null != entity)
        {
            dto = new PaymentDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setCode(entity.getCode());
            dto.setIcon(entity.getIcon());
            dto.setEnabled(entity.getEnabled());
            dto.setConfig(entity.getConfig());
        }
        
        return dto;
    }
    
    /**
     * 转换为DTO对象
     * 
     * @param entities
     * @return List<PaymentDTO>
     */
    public static List<PaymentDTO> toDTO(List<Payment> entities)
    {
        List<PaymentDTO> dtos = null;
        if (!CollectionUtils.isEmpty(entities))
        {
            dtos = new ArrayList<PaymentDTO>();
            for (Payment entity : entities)
            {
                PaymentDTO dto = PaymentAssembler.toDTO(entity);
                if (null != dto)
                {
                    dtos.add(dto);
                }
            }
        }
        
        return dtos;
    }
    
    /**
     * 转换为Entity对象
     * 
     * @param dto
     * @return Payment
     */
    public static Payment toEntity(PaymentDTO dto)
    {
        Payment entity = null;
        if (null != dto)
        {
            entity = new Payment();
            entity.setId(dto.getId());
            entity.setName(dto.getName());
            entity.setCode(dto.getCode());
            entity.setIcon(dto.getIcon());
            entity.setEnabled(dto.getEnabled());
            entity.setConfig(dto.getConfig());
        }
        
        return entity;
    }
    
}