package com.learning.SpringBoot.restAPIDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.SpringBoot.restAPIDemo.dao.EmployeeRepository;
// import com.learning.SpringBoot.restAPIDemo.dao.EmployeeDAO;
import com.learning.SpringBoot.restAPIDemo.entity.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {

  private EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeServiceImple(EmployeeRepository theEmployeeRepository) {
    employeeRepository = theEmployeeRepository;
  }

  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee findById(int theId) {
    Optional<Employee> employee = employeeRepository.findById(theId);

    if (employee.isPresent()) {
      return employee.get();
    } else {
      throw new RuntimeException("Did not find employee id - " + theId);
    }

  }

  // for both save and update
  @Override
  public Employee save(Employee theEmployee) {
    return employeeRepository.save(theEmployee);
  }

  @Override
  public void deleteById(int theId) {
    employeeRepository.deleteById(theId);
  }

}
