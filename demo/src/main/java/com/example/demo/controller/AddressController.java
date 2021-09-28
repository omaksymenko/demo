package com.example.demo.controller;

import com.example.demo.feign.FeignEurekaClient;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@Data
@RequestMapping("/address")
public class AddressController {
    private static final Logger LOGGER = LogManager.getLogger(AddressController.class);

    private String url;

    @Autowired
    private FeignEurekaClient feignEurekaClient;

    private WebClient webClient;

    public AddressController(WebClient.Builder webClientBuilder, @Value("${url}") String url) {
        this.webClient = webClientBuilder.baseUrl(this.url).build();
    }

    @GetMapping("/say-yo")
    public void getYo(){
        Mono.justOrEmpty(feignEurekaClient.sayYo())
                .log()
                .doOnNext(element -> LOGGER.info("next"))
                .subscribe(String::toUpperCase);
    }
}
