package com.sv.mall.order.dao;

import com.sv.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-31 20:26:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
