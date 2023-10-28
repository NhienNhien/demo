package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Computer;
import com.example.demo.repository.ComputerRepository;
import com.example.demo.service.ComputerService;

@Service
public class ComputerServiceImpl implements ComputerService{

	private ComputerRepository computerRepository;
	
	
	public ComputerServiceImpl(ComputerRepository computerRepository) {
		super();
		this.computerRepository = computerRepository;
	}


	@Override
	public List<Computer> getAllComputers() {
		// TODO Auto-generated method stub
		return computerRepository.findAll();
	}


	@Override
	public Computer saveComputer(Computer computer) {
		// TODO Auto-generated method stub
		return computerRepository.save(computer);
	}


	@Override
	public Computer getComputerById(Integer id) {
		// TODO Auto-generated method stub
		return computerRepository.findById(id).get();
	}


	@Override
	public Computer updateComputer(Computer computer) {
		// TODO Auto-generated method stub
		return computerRepository.save(computer);
	}


	@Override
	public void deleteComputerById(Integer id) {
		// TODO Auto-generated method stub
		computerRepository.deleteById(id);
		
	}

}