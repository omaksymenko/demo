package com.example.demo.service;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    // then do it by other fields
    public Address getAddressById(int id) {
        return addressRepository.findById(id).orElse(null);
    }

    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    public void removeAddress(Address address) {
        addressRepository.delete(address);
    }
}
