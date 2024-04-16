package com.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class navcontroller {
	@GetMapping("/map-register")
	public String registermapping() {
		return "register";
	}
	@GetMapping("/map-login")
	public String loginmapping() {
		return "login";
	}
	@GetMapping("/map-songs")
	public String songmapping() {
		return "addsongs";
	}
	@GetMapping("/map-songsuccess")
	public String songsuccessmapping() {
		return "songsuccess";
	}
}
