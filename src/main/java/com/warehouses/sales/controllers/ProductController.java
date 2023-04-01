package com.warehouses.sales.controllers;

import com.warehouses.sales.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/welcome")
    public void greeting(){

        System.out.println("hi");
    }
    @GetMapping("/")
    public String homePage(){
        return productService.printProductName();
    }
    @GetMapping("/product-name")
    public ProductNameResponse getProductName(){
        return  new ProductNameResponse ("product one",List.of("larg","small"),4.5,"" ,new ProductInfo("Red","Box"));
    }
    record ProductInfo (String color , String unitName){}

    record ProductNameResponse (
            String productName,
            List<String> ProductSizes,
            double ProductPrise ,
            String Desc,
            ProductInfo productInfo
    ){}
}
