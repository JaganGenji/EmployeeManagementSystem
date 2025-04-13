package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public interface EmployeeService {
  public String empRegister(Employee e);
  public String loginValidation(String email,String password);
  public Iterable<Employee> showAll(); 
  public boolean FindByEmail(String email);
  public Employee findbyid(int id);
  public Employee  UpdateEmployee(Employee e);
  public boolean deleteEmployee(int id);
  
}
