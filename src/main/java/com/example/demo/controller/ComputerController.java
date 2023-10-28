package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Computer;
import com.example.demo.service.ComputerService;

@Controller
public class ComputerController {
	private ComputerService computerService;

	public ComputerController(ComputerService computerService) {
		super();
		this.computerService = computerService;
	}
	@GetMapping("/computers")
	public String listComputers(Model model) {
		model.addAttribute("computers", computerService.getAllComputers());
		return "computers";
	}
	
	@GetMapping("/computers/add")
	public String createComputerForm(Model model) {
		Computer computer = new Computer();
		model.addAttribute("computer", computer);
		return "create_conmputer";
	}
	
	@PostMapping("/computers")
	public String saveComputer(@ModelAttribute("computer") Computer computer) {
		computerService.saveComputer(computer);
		return "redirect:/computers";
	}
	
	@GetMapping("/computers/edit/{id}")
	public String editComputerForm(@PathVariable Integer id, Model model) {
		model.addAttribute("computer", computerService.getComputerById(id));
		return "edit_computer";
	}
	
	@PostMapping("/computers/{id}")
	public String updateComputer(@PathVariable Integer id, @ModelAttribute("computer") Computer computer, Model model) {
		//get computer from DB id
		Computer existingComputer = computerService.getComputerById(id);
		existingComputer.setID(id);
		existingComputer.setCpu(computer.getCpu());
		existingComputer.setDongia(computer.getDongia());
		existingComputer.setHangsanxuat(computer.getHangsanxuat());
		existingComputer.setHedieuhanh(computer.getHedieuhanh());
		existingComputer.setManhinh(computer.getManhinh());
		existingComputer.setOcung(computer.getManhinh());
		existingComputer.setRam(computer.getRam());
		existingComputer.setSoluong(computer.getSoluong());
		existingComputer.setTen(computer.getTen());
		
		//save update computer
		computerService.updateComputer(existingComputer);
		return "redirect:/computers";
	}
	
	//hander method to handle delete computer request
	@GetMapping("/computers/{id}")
	public String deleteComputer(@PathVariable Integer id) {
		computerService.deleteComputerById(id);
		return "redirect:/computers";
	}
}
