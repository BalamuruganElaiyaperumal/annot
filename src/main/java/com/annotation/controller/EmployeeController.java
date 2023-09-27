package com.annotation.controller;


import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotation.entity.Employee;
import com.annotation.exception.Excetion;
import com.annotation.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	Logger log=Logger.getLogger(EmployeeController.class);
	
	@PostMapping(value="/set")
	public String set(@RequestBody Employee a) throws Excetion {
		PropertyConfigurator.configure("Test");
		log.info("succesfully");
		return es.set(a);
	}
	
	
	@GetMapping(value="/getAll")
	public List<Employee>getAll(){
		PropertyConfigurator.configure("Test");
		log.info(es.getAll());
		
		return es.getAll();
	}
	

}
