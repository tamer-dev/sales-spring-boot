package com.warehouses.sales.controllers;

import com.warehouses.sales.models.CustomerModel;
import com.warehouses.sales.repository.CustomerRepository;
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

    @GetMapping("/customers/{customerID}")
    public CustomerModel show(@PathVariable("customerID") Integer id){
        return customerRepository.findById(id).get();
    }


    @PutMapping("/customers/{customerID}")
    public void update(@PathVariable("customerID") Integer id,@RequestBody NewCustomerRequest request){
        CustomerModel customer = customerRepository.findById(id).get();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);
    }
    @DeleteMapping("/customers/{customerID}")
    public void delete(@PathVariable("customerID") Integer id){
        customerRepository.deleteById(id);
    }


}
