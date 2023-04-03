package com.warehouses.sales.controllers;

import com.warehouses.sales.models.CustomerModel;
import com.warehouses.sales.repository.CustomerRepository;
import com.warehouses.sales.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<CustomerModel> index(){
        return customerRepository.findAll();
    }

    record NewCustomerRequest(
            String name,
            String email,
            Integer age
    ){

    }
    @PostMapping("/customers")
    public void add(@RequestBody NewCustomerRequest request){
        CustomerModel customer = new CustomerModel();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);

    }
    @DeleteMapping("/customers/{customerID}")
    public void deleteCustomer(@PathVariable("customerID") Integer id){
        customerRepository.deleteById(id);
    }


}
