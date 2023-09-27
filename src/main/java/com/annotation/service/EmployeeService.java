package com.annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.annotation.dao.EmployeeDao;
import com.annotation.entity.Employee;
import com.annotation.exception.Excetion;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String set(Employee a) throws Excetion {
		if(a.getSalary()>=50000) {
			
			throw new Excetion("High salary was not accepted");
		}
		else {
			
			return ed.set(a);

		}
		
	}

	public List<Employee> getAll() {
		return ed.getAll();
	}

}
