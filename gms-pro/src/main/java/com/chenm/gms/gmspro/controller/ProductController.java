package com.chenm.gms.gmspro.controller;

import com.chenm.gms.gmspro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("pro")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/decrease")
    public Map<String,String> decrease(@RequestParam("id") String itemId,
                                       @RequestParam("count") Integer count){
        boolean flag=productService.decrease(itemId,count);
        Map<String,String> map=new HashMap<String,String>();
        if(flag){
            map.put("code","0000");
            map.put("msg","success");
        }else{
            map.put("code","-1");
            map.put("msg","fail");
        }
        return map;
    }
}
