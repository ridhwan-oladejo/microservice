package com.rinformatiks.ai.service;

import com.rinformatiks.ai.model.Customer;
import com.rinformatiks.ai.model.CustomerRegistrationRequest;
import com.rinformatiks.ai.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository repository) {
    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        //todo: check email is valid
        //todo: check if email is not taken
        repository.save(customer);
    }
}
