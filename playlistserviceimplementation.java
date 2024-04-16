package com.tunehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.repository.playlistrepo;
@Service
public class playlistserviceimplementation implements playlistservice {
	@Autowired
	playlistrepo prepo;

}
