package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmpRepository;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmpRepository empRepo;

	@Override
	public String empRegister(Employee e) {
		empRepo.save(e);
		
		return "Employee Saved sucessfully";
	}

	@Override
	public String loginValidation(String email, String password) {
	    Employee employee = empRepo.findByEmail(email);

	    if (employee == null) {
	        return "Email is not registered";
	    } else if (!employee.getPassword().equals(password)) {
	        return "Incorrect password";
	    } else {
	        return "Good";
	    }
	    
	}

	@Override
	public Iterable<Employee> showAll() {
		
		return empRepo.findAll();
	}

	@Override
	public boolean FindByEmail(String email) {
		 Employee employee = empRepo.findByEmail(email);
		 if (employee == null) {
		        return false;
		    }

		return true;
	}
	

}
