package com.thoughtworks.capability.service;

import com.thoughtworks.capability.repository.ShoppingCartRepository;
import com.thoughtworks.capability.web.ShoppingCartResponse;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShoppingCartServiceTest {


    private ShoppingCartRepository shoppingCartRepository = mock(ShoppingCartRepository.class);
    private ShoppingCartService shoppingCartService = new ShoppingCartService(shoppingCartRepository);

    @Test
    void should_return_empty_products_list() {
        // given
        when(shoppingCartRepository.findAll()).thenReturn(Lists.emptyList());

        // when
        ShoppingCartResponse products = shoppingCartService.findProducts();

        // then
        assertEquals(0, products.getProducts().size());
        assertEquals(BigDecimal.ZERO, products.getTotalAmount());
    }
}