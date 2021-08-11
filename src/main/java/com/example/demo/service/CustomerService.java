package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Set<Customer> getCustomers() {
        return new HashSet<>(customerRepository.findAll());
    }
}
