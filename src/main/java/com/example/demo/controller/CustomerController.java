package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public Set<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomerById(id);
    }
}
