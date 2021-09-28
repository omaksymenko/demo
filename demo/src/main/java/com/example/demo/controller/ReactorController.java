package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/reactor")
public class ReactorController {
    private static final Logger LOGGER = LogManager.getLogger(ReactorController.class);
    @GetMapping
    public void getNumbers() {
        Flux<Integer> numbers = Flux.range(1, 510);
        numbers.limitRate(10);
        numbers.subscribe(
                LOGGER::info,
                LOGGER::error,
                () -> LOGGER.info("Completed"),
                (element) -> {
                    element.request(100);
                    LOGGER.info("subscription");
                });
    }
}
