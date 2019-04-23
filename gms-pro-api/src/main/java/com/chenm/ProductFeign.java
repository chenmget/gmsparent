package com.chenm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


public interface ProductFeign {

    @PostMapping("/pro/decrease")
    Map<String,String> decrease(@RequestParam("id") String itemId,
                                       @RequestParam("count") Integer count);
}
