package com.mohit.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mohit.app.model.Employee;
import com.mohit.app.model.Login;
import com.mohit.app.service.AuthenticationService;

@Controller
public class AuthenticationController {
	
	@Autowired
	AuthenticationService authenticationService;
	
	@PostMapping(value="signup")
	public String signup(@ModelAttribute Employee employee) {
		return authenticationService.register(employee);
	}
	
	@PostMapping(value="login")
	public String login(@ModelAttribute Login login, Model model) {
		if(authenticationService.validateUser(login))
			return "welcome";
		model.addAttribute("message", "Credentials not correct ! Please try again");
		return "login";
	}
	
	@GetMapping(value="check-email-uniqueness")
	@ResponseBody
	public Map<String, Integer> checkUniqueness(@RequestParam("email") String email) {
		return authenticationService.emailIsUnique(email);
	}
}
