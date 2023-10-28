package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Computer;
import com.example.demo.repository.ComputerRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private ComputerRepository computerRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Computer computer = new Computer("test", "test", "test", "test", "test", "test", "test", "test", "test");
//		computerRepository.save(computer);
		
	}

}
