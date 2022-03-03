package com.thoughtworks.capability.service;


import com.thoughtworks.capability.repository.ShoppingCartRepository;
import com.thoughtworks.capability.web.ShoppingCartResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public ShoppingCartResponse findProducts() {
        List productsList = shoppingCartRepository.findAll();
        return new ShoppingCartResponse(productsList, BigDecimal.ZERO);
    }
}
