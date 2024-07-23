package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class laptop {
	
	@Autowired
	cpu cpu;
	public void compile() {
		cpu.execute();
	}

}
