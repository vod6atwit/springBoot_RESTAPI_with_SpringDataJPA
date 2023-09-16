package com.learning.SpringBoot.restAPIDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.SpringBoot.restAPIDemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  // No need to write any code
}
