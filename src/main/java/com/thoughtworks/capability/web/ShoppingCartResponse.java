package com.thoughtworks.capability.web;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ShoppingCartResponse {
    private List products;
    private BigDecimal totalAmount;

    public ShoppingCartResponse(List<Object> products, BigDecimal totalAmount) {
        this.products = products;
        this.totalAmount = totalAmount;
    }
}
