package com.chenm.gmsorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GmsOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsOrderApplication.class, args);
    }

}
