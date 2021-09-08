package com.example.demo.feign;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "my-client", fallback = HystrixClientFallback.class) // name of Eureka client (data producer)
@LoadBalancerClient(value = "my-client")
public interface FeignEurekaClient { // data consumer
    @GetMapping("yo")
    String sayYo();
}
