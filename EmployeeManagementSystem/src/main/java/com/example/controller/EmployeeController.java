package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empser;
	
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	@GetMapping("/show")
	public String Show(Map<String, Object> map) {
		Iterable<Employee> li=empser.showAll();
		map.put("res", li);
		return "Show";
	}
	@GetMapping("/login")
	public String Logindet() {
		return "login";
	}
	@PostMapping("/login")
	public String validation(@RequestParam("username") String email,
            @RequestParam("password") String pass,
            RedirectAttributes  res) {
		String resu=empser.loginValidation(email, pass);
		if(resu.equals("Good"))
		{
			res.addFlashAttribute("resme", resu);
			return "redirect:/";
			
		}
		else
		{
			res.addFlashAttribute("error", resu);
			return "redirect:/login";
		}
			
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@PostMapping("/register")
	public String registation(@ModelAttribute Employee user, RedirectAttributes model)
	{
		String mail=user.getEmail();
		boolean re= empser.FindByEmail(mail);
		if(re==false) {
			empser.empRegister(user);
			return "redirect:/";

		}
		else
		{
			model.addFlashAttribute("error", "Mail is already register please log in");
			return "redirect:/login";

		}
			}
	
	public String register(Employee e)
	{
		System.out.println("EmployeeController.register()");
		return empser.empRegister(e);
	}
	public String loginva(String email,String pass)
	{
		return empser.loginValidation(email, pass);
	}
	
	
	
	

}
