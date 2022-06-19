package com.example.discount.controller;

import com.example.discount.config.PropertiesConfig;
import com.example.discount.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private PropertiesConfig configuration;

    @GetMapping("/discount")
    public Discount getDiscount() {
        return new Discount(configuration.getVersion(),configuration.getCenter(), configuration.getPrice());
    }
}
