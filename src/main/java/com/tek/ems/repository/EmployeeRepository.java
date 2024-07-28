package com.tek.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tek.ems.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{ //which provides higher level of abstraction and additional features

}
