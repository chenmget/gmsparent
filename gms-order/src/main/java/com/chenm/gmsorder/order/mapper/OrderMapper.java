package com.chenm.gmsorder.order.mapper;

import com.chenm.common.mapper.OrderBaseMapper;
import com.chenm.gmsorder.order.domain.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends OrderBaseMapper<Orders> {
}
