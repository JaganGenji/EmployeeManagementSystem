package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	Employee findByEmail(String email);

}
