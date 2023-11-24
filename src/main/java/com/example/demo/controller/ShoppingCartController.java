package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.CartItem;
import com.example.demo.entity.Computer;
import com.example.demo.service.ComputerService;
import com.example.demo.service.ShoppingCartService;

@Controller
@RequestMapping("/shopping-cart")
public class ShoppingCartController {
	@Autowired
	ComputerService computerService;
	
	@Autowired
	ShoppingCartService shoppingCartService;
	@GetMapping("views")
	public String viewCarts(Model model) {
		model.addAttribute("CART_ITEMS", shoppingCartService.getAllItems());
		model.addAttribute("TOTAL", shoppingCartService.getAmount());
		return "cart-item";
	}
	
	@GetMapping("add/{id}")
	public String addCart(@PathVariable("id") Integer id) {
		Computer computer = computerService.getComputerById(id);
		if (computer != null) {
			CartItem item = new CartItem();
			item.setComputerId(computer.getID());
			item.setTen(computer.getTen());
			item.setGia(computer.getDongia());
			item.setSoluong(1);
			shoppingCartService.add(item);
		}
		return "redirect:/shopping-cart/views";
	}
	
	@GetMapping("clear")
	public String clearCart() {
		shoppingCartService.clear();
		return "redirect:/shopping-cart/views";
	}
	
	@GetMapping("remove/{id}")
	public String removeCart(@PathVariable("id") Integer id) {
		shoppingCartService.remove(id);
		return "redirect:/shopping-cart/views";
	}
	
	@PostMapping("update")
	public String update(@RequestParam("id") Integer id, @RequestParam("qty") Integer soluong) {
		shoppingCartService.update(id,soluong);
		return "redirect:/shopping-cart/views";
	}
}
