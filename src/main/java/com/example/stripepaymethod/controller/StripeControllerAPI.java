package com.example.stripepaymethod.controller;

import com.example.stripepaymethod.model.CustomerData;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;


import com.stripe.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StripeControllerAPI {
@Value("${stripe.apikey}")
    String stripeKey;
@PostMapping("/createCustomer")
    public CustomerData index(@RequestBody CustomerData customer) throws StripeException {
    Stripe.apiKey=stripeKey;
    Map<String,Object> params=new HashMap<>();
    params.put("name",customer.getName());
    params.put("email",customer.getEmail());

    Customer customer1= Customer.create(params);

       customer.setCustomerId(customer1.getId());
        return customer;
    }
}
