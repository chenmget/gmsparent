package com.chenm.gmsorder.order.feign;

import com.chenm.ProductFeign;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("gms-pro-server")
public interface ProductService extends ProductFeign {

}
