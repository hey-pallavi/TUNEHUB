package com.tunehub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tunehub.entities.songs;
import com.tunehub.repository.songsrepo;
@Service
public class songsserviceimplementation implements songsservice{
	@Autowired
songsrepo srepo;
	@Override
	public String addsongs( songs song) {
		srepo.save(song);
		
		return "SONGS ARE ADDED";
	}
	@Override
	public boolean existsong(String songname) {
	songs song = srepo.findBysongname(songname);
	if (song == null) {
		return false;	
	}
	else {
		return true;
	}
}
	@Override
	public List<songs> fetchALLsongs() {
		List<songs>songlist= srepo.findAll();
		return songlist;
		}
	}
