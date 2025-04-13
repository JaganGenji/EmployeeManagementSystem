package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMP_RES_DET")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EId")
	private Integer EId;
	@Column(name="EName")
	private String EName;
	@Column(name="Email" ,unique=true)
	private String email;
	@Column(name="Password", length=8)
	private String password;
	@Column(name="mobile")
	private String mobile;
	@Column(name="Address")
	private String Address;
	
	
	

}
