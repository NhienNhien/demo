package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import com.example.demo.entity.CartItem;

public interface ShoppingCartService {

	float getAmount();

	int getCount();

	Collection<CartItem> getAllItems();

	void clear();

	CartItem update(int computerId, int soluong);

	void remove(int id);

	void add(CartItem item);
	
	List<CartItem> getCartByUsername(String username);
	
}
