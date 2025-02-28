package ait.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StudentManagement")
public class HomeController {
	
	@GetMapping("/stu")
	public String home() {
		return "home";
	}
}
