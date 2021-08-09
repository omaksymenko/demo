package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "country")
    private String country;
    @NotNull
    @Column(name = "city")
    private String city;
    @NotNull
    @Column(name = "street")
    private String street;
    @NotNull
    @Min(1)
    @Column(name = "house_number")
    private int houseNumber;
    @ManyToMany(mappedBy = "addresses")
    Set<Customer> customers;

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        this.customers.remove(customer);
    }
}
