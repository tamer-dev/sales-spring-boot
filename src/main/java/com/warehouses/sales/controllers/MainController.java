package com.warehouses.sales.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @GetMapping("/")
    public String homePage(){
        return "this very simple api by java spring boot";
    }

    @GetMapping("/welcome")
    public void greeting(){
        System.out.println("hi");
    }
}
