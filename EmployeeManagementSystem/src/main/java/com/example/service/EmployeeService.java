package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public interface EmployeeService {
  public String empRegister(Employee e);
  public String loginValidation(String email,String password);
  public Iterable<Employee> showAll(); 
  public boolean FindByEmail(String email);
}
