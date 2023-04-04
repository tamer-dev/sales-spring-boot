package com.warehouses.sales.services;

import com.warehouses.sales.models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
    @Autowired
    private ProductModel productModel;
    public String printProductName(){
        return productModel.getProductName();
    }
}
