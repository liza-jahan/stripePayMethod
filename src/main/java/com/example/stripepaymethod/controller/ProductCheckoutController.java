package com.example.stripepaymethod.controller;


import com.example.stripepaymethod.dto.ProductRequest;
import com.example.stripepaymethod.dto.StripeResponse;
import com.example.stripepaymethod.service.StripeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/v1")
@AllArgsConstructor
public class ProductCheckoutController {
    private final StripeService service;


    @PostMapping("/checkout")
    public ResponseEntity<StripeResponse> checkOutProducts(@RequestBody ProductRequest productRequest){
    StripeResponse stripeResponse=service.checkoutProducts(productRequest);


        return ResponseEntity.status(HttpStatus.OK)
                .body(stripeResponse);
    }

}
