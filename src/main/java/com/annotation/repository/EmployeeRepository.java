package com.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annotation.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
