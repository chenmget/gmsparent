package com.chenm.gmsorder.order.service;

import com.chenm.gmsorder.order.domain.Orders;
import com.chenm.gmsorder.order.feign.ProductService;
import com.chenm.gmsorder.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Autowired(required = false)
    private ProductService productService;

    @Override
    public boolean bookService(String itemId,Integer buyCount) {
        Map<String,String> map= productService.decrease(itemId,buyCount);
        if(map.get("code").equals("0000")){
            Orders order = new Orders();
            order.setId(UUID.randomUUID().toString().replace("-","").toUpperCase());
            order.setOrderNum(UUID.randomUUID().toString().replace("-","").toUpperCase());
            order.setItemId(itemId);
            return this.orderMapper.insert(order)>0;
        }

        return false;
    }
}
