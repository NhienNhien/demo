package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Computer;

public interface ComputerService {
	List<Computer> getAllComputers();
	
	Computer saveComputer(Computer computer);
	
	Computer getComputerById(Integer id);
	Computer updateComputer(Computer computer);
	
	void deleteComputerById(Integer id);
}
