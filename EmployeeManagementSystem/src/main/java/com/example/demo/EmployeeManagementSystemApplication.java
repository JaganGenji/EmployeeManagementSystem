package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.controller.EmployeeController;
import com.example.entity.Employee;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example.repository")
@EntityScan(basePackages = "com.example.entity")
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		/*ApplicationContext context = */SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		/* EmployeeController controller = context.getBean(EmployeeController.class);
			Employee e=new Employee();
			e.setEName("Jagan");
			e.setEmail("20551a0511@gmail.com");
			e.setMobile("9392547169");
			e.setAddress("Hyderbad");
			e.setPassword("hellosam");
			controller.register(e);
		 System.out.println("EmployeeManagementSystemApplication.main()");
		 System.out.println("Enter email");
		 Scanner sc=new Scanner(System.in);
		 String email=sc.nextLine();
		 System.out.println("Enter password");
		 String pass=sc.nextLine();
		 System.out.println("+++++++++++++++++++++==============================+++++++++++++++++++++++++++++++");
		 System.out.println(controller.loginva(email, pass));*/

	}

}
