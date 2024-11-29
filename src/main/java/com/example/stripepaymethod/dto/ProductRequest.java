package com.example.stripepaymethod.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private  String productName;
    private  Long  amount;
    private  String quantity;
    private  String currency;
}
