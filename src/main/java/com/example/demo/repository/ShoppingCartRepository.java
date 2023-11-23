package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CartItem;

public interface ShoppingCartRepository extends JpaRepository<CartItem, Integer>{

}
