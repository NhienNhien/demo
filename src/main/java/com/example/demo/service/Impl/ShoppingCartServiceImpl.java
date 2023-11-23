package com.example.demo.service.Impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.example.demo.entity.CartItem;
import com.example.demo.service.ShoppingCartService;

@SessionScope
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	Map<Integer, CartItem> maps = new HashMap<>();
	@Override
	public void add(CartItem item) {
		CartItem cartItem = maps.get(item.getComputerId());
		if (cartItem == null) {
			maps.put(item.getComputerId(), item);
		}else {
			cartItem.setSoluong(cartItem.getSoluong()+1);
		}
	}
	
	@Override
	public void remove(int id) {
		maps.remove(id);
	}
	
	@Override
	public CartItem update(int computerId, int soluong) {
		CartItem cartItem = maps.get(computerId);
		cartItem.setSoluong(soluong);
		return cartItem;
	}
	
	@Override
	public void clear() {
		maps.clear();
	}
	
	@Override
	public Collection<CartItem> getAllItems(){
		return maps.values();
	}
	
	@Override
	public int getCount() {
		return maps.values().size();
	}
	
	@Override
	public float getAmount() {
		return (float) maps.values().stream().mapToDouble(item -> item.getSoluong() * item.getGia()).sum();
	}
}
