package com.thoughtworks.capability.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository {
    List findAll();
}
