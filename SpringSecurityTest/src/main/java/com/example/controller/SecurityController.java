package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Login;
import com.example.bean.Security;
import com.example.repository.SecurityRepository;
import com.example.service.SecurityService;


// This controller does not have a login function held within it, because spring security autogenerates a login function mapped to /login (not /test/login).
@RestController
@RequestMapping("test")
@CrossOrigin
public class SecurityController {

	private SecurityRepository securityRepository;
	
	public SecurityController(SecurityRepository securityRepository) {
		this.securityRepository = securityRepository;
	}
	
	// Method available to all.
	@GetMapping("public")
	public String testPublic() {
		return "This is public.";
	}

	// Method available to users.
	@GetMapping("user")
	public String testUser() {
		return "This is for users only.";
	}

	// Method available to admins.
	@GetMapping("admin")
	public String testAdmin() {
		return "This is for admins only.";
	}

}
