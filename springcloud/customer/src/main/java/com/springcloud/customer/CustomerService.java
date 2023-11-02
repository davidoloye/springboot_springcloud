package com.springcloud.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void  registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);

        //check of email is valid
        //check if email is not taken
        //store customers in db
    }

}
