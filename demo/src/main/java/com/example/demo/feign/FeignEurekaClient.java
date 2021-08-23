package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("my-client") // name of Eureka client
public interface FeignEurekaClient {
    @GetMapping("yo")
    String sayYo();
}
