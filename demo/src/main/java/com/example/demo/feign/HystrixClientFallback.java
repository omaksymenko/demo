package com.example.demo.feign;

import org.springframework.stereotype.Component;

@Component
class HystrixClientFallback implements FeignEurekaClient {

    @Override
    public String sayYo() {
        return "fallback";
    }
}
