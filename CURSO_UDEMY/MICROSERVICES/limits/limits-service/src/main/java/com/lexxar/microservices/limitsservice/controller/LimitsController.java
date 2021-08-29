package com.lexxar.microservices.limitsservice.controller;

import com.lexxar.microservices.limitsservice.configuration.Configuration;
import com.lexxar.microservices.limitsservice.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping(path = "/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
