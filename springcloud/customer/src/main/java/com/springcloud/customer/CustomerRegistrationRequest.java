package com.springcloud.customer;

public record CustomerRegistrationRequest(
        Integer id,
        String firstName,
        String lastName,
        String email
) {

}
