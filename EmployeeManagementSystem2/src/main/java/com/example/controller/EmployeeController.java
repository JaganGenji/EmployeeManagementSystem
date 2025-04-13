package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	private EmployeeService emp;
	
	@GetMapping("/show")
	public ResponseEntity<List<Employee>> ShowDetails() {
	Iterable< Employee>res=	emp.showAll();
	 List<Employee> employeeList = new ArrayList<>();
     res.forEach(employeeList::add);
		
		return new ResponseEntity<List<Employee>>(employeeList,HttpStatus.OK);
	}
	
	@PostMapping("/addEmp")
	public ResponseEntity<String> addEmployee(@RequestBody Employee e) {
		// System.out.println("Name===" + e.getEName() + "+++++++++++++++++++++++" + "Mobile no===" + e.getEmail());
	    emp.empRegister(e);

	    //System.out.println("Name===" + e.getEName() + "+++++++++++++++++++++++" + "Mobile no===" + e.getEmail());
	    return new ResponseEntity<>("Hello register success "+e.getEName(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getbyId(@PathVariable int id)
	{
		Employee employee=emp.findbyid(id);
		if(employee==null)
		{
			return ResponseEntity.notFound().build();
		}
		
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
	    Employee existingEmployee = emp.findbyid(employee.getEId());
	    if (existingEmployee == null) {
	        return ResponseEntity.notFound().build();
	    }
	    
	    existingEmployee.setEName(employee.getEName());
	    existingEmployee.setEmail(employee.getEmail());
	    existingEmployee.setPassword(employee.getPassword());
	    existingEmployee.setMobile(employee.getMobile());
	    existingEmployee.setAddress(employee.getAddress());
	    
//	    emp.empRegister(existingEmployee);
	    emp.UpdateEmployee(existingEmployee);
	    return ResponseEntity.ok("Employee updated successfully!");
	}
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<String> deleteEmployee(@PathVariable int id)
//	{
//		boolean res=emp.deleteEmployee(id);
//		
//		return ResponseEntity.ok("Deleted Sucessfully "+id);
//		
//	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<String, String>> deleteEmployee(@PathVariable int id) {
	    boolean res = emp.deleteEmployee(id);
	    Map<String, String> response = new HashMap<>();
	    response.put("message", "Deleted Successfully " + id);
	    return ResponseEntity.ok(response);
	}


	
	

	

}
