package com.example.demo.service.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.example.demo.entity.Order;

@SessionScope
@Service
public class OrderServiceImpl {
	Map<Integer, Order> maps = new HashMap<>();
	
//	public void add(Order order) {
//		Order order2 = maps.get(order.get);
//	}
}
