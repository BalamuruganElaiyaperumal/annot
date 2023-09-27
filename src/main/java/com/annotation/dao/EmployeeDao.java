package com.annotation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.annotation.entity.Employee;
import com.annotation.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
        EmployeeRepository er;

	public String set(Employee a) {
        er.save(a);
		return "Success";
	}

	public List<Employee> getAll() {
		return  er.findAll();
 
	}
}
