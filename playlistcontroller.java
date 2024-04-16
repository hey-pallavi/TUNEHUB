package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.entities.playlist;
import com.tunehub.entities.songs;
import com.tunehub.services.playlistservice;
import com.tunehub.services.songsservice;

@Controller
public class playlistcontroller {
	@Autowired
	playlistservice psrv;
	@Autowired
	songsservice sgsrv;
	@GetMapping("/map-createplaylist")
	public String createplaylist(Model model) {
		List<songs>songslist =sgsrv.fetchALLsongs();
		model.addAttribute("songslist", songslist);
		return "createplaylist";	
	}	
@PostMapping("/addplaylist")
public String addplaylist(@ModelAttribute playlist playlist) {
	return "playlistsuccess";
}
}

