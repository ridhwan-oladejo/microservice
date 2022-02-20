package com.rinformatiks.ai.controller;

import com.rinformatiks.ai.model.CustomerRegistrationRequest;
import com.rinformatiks.ai.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("api/v1/customer")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void postCustomer(@RequestBody CustomerRegistrationRequest request){
        log.info("New Customer created {} ", request);
        customerService.register(request);
    }
}
