package com.tunehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tunehub.entities.usersentity;
import com.tunehub.services.userservice;


@Controller
public class usercontroller {
	@Autowired
	userservice usrv;
	
	@PostMapping("/register")
	public String adduser(@ModelAttribute usersentity user) {
		boolean userstatus = usrv.existemailid(user.getEmailid());
		if(userstatus==false) {
			usrv.adduser(user);
			System.out.println("user added");
		}
		else {
			System.out.println("user exists");
		}
		return "home" ;
}
	@PostMapping("/login")
	public String validateuser(@RequestParam String emailid, @RequestParam String password) {
		if(usrv.validateuser(emailid, password) == true) {
			if (usrv.getRole(emailid).equals("ADMIN")) {
			
			return "adminhome";
		}
		else { 
		return "customerhome";
	          }		
		}
	else {
		return "loginfail";
	}	
   }
  }
