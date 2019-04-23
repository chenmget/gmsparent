package com.chenm.gmsorder.order.controller;

import com.chenm.gmsorder.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/bookOrder/{id}/{count}")
    public Map<String,String> bookOrder(@PathVariable("id") String itemId,
                                       @PathVariable("count") Integer count){
        Map<String,String> map=new HashMap<String,String>();
        boolean result=orderService.bookService(itemId,count);
        if(result){
            map.put("code","0000");
            map.put("msg","success");
        }else{
            map.put("code","-1");
            map.put("msg","fail");
        }
        return map;
    }
}
