package com.domain.controller;

import com.domain.config.LimitConfiguration;
import com.domain.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env")
public class LimitController {
    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/limit")
    public Limit getLimit() {
        return new Limit(limitConfiguration.getMin(), limitConfiguration.getMax());
    }
}
