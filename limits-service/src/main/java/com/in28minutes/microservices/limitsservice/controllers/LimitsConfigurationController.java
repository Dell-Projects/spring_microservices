package com.in28minutes.microservices.limitsservice.controllers;

import com.in28minutes.microservices.limitsservice.beans.LimitsConfiguration;
import com.in28minutes.microservices.limitsservice.configurations.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(configuration.getMax(), configuration.getMin());
    }
}