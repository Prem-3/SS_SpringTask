package com.details.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeDetails {
	@RequestMapping("/employee")
	public String Employee() {
		return "employee";
	}
}
