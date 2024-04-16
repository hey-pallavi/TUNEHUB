package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.tunehub.entities.songs;
import com.tunehub.services.songsservice;

@Controller
public class songscontroller {
	@Autowired(required=true)
	songsservice  sgsrv;
	@PostMapping("/addsongs")
	public String  addsongs(@ModelAttribute songs song) {
		String songname =song.getSongname();
		boolean status =sgsrv.existsong(songname);
		if (status == false) {
			sgsrv.addsongs(song);
			return "songsuccess";
		}
		else {
		return "songfail";
}
}
	@GetMapping("/map-viewsongs")
	public String viewsongs(Model model) {
	    List<songs> songslist = sgsrv.fetchALLsongs();
	    model.addAttribute("songslist", songslist);
	    return "displaysongs";
	}

	@GetMapping("/viewsongs")
	public String viewCustomerSongs(Model model) {
	    boolean primeCustomerStatus = false;
	    if (primeCustomerStatus) {
	        List<songs> songslist = sgsrv.fetchALLsongs();
	        model.addAttribute("songslist", songslist);
	        return "displaysongs";
	    } else {
	        return "makepayment";
	    }
	}
}

