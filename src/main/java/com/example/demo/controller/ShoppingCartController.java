package com.example.demo.controller;

import java.security.Principal;
import java.util.List;

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
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/shopping-cart")
public class ShoppingCartController {
	@Autowired
	ComputerService computerService;
	
	@Autowired
	ShoppingCartService shoppingCartService;
	
	@Autowired
	UserService userService;
	
	@GetMapping("views")
	public String viewCarts(Model model) {
		String username = userService.getUsername();
		model.addAttribute("username", username);
//		model.addAttribute("CART_ITEMS", shoppingCartService.getAllItems());
		model.addAttribute("CART_ITEMS", shoppingCartService.getCartByUsername(username));
//		model.addAttribute("TOTAL", shoppingCartService.getAmount());
		model.addAttribute("TOTAL", shoppingCartService.getAmount(username));
		return "cart-item";
	}
	
	@GetMapping("/computers_user")
	public String listComputersUser(@RequestParam String username, Model model) {
//		String username = (String) model.getAttribute("username");
		model.addAttribute("username", username);
		model.addAttribute("computers", computerService.getAllComputers());
		return "/computers_user";
//		return findPaginated(1, model);
	}
	
//	@GetMapping("add/{id}")
//	public String addCart(@PathVariable("id") Integer id) {
//		Computer computer = computerService.getComputerById(id);
//		if (computer != null) {
//			CartItem item = new CartItem();
//			item.setComputerId(computer.getID());
//			item.setTen(computer.getTen());
//			item.setGia(computer.getDongia());
//			item.setSoluong(1);
//			shoppingCartService.add(item);
//		}
//		return "redirect:/shopping-cart/views";
//	}
	
	@GetMapping("add/{id}")
	public String addCart(@PathVariable("id") Integer id) {
		String username = userService.getUsername();
		List<CartItem> list = shoppingCartService.getCartByUsername(username);
		int check = 1;
		Computer computer = computerService.getComputerById(id);
		for(CartItem cartItem:list) {
			if (cartItem.getComputerId().equals(id)) {
				check = 0;
				cartItem.setSoluong(cartItem.getSoluong()+1);
				shoppingCartService.add(cartItem);
				break;
			}
		}
		if (check == 1) {
			CartItem item = new CartItem();
			item.setUsername(username);
			item.setComputerId(computer.getID());
			item.setTen(computer.getTen());
			item.setGia(computer.getDongia());
			item.setSoluong(1);
			shoppingCartService.add(item);
		}
		return "redirect:/shopping-cart/views";
	}
	
//	@GetMapping("clear")
//	public String clearCart() {
//		shoppingCartService.clear();
//		return "redirect:/shopping-cart/views";
//	}
	
	@GetMapping("clear")
	public String clearCart() {
		String username = userService.getUsername();
		shoppingCartService.clear(username);
		return "redirect:/shopping-cart/views";
	}
	
//	@GetMapping("remove/{id}")
//	public String removeCart(@PathVariable("id") Integer id) {
//		shoppingCartService.remove(id);
//		return "redirect:/shopping-cart/views";
//	}
	
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
