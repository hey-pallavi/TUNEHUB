package com.tunehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entities.usersentity;
import com.tunehub.repository.userrepository;

@Service
public class userserviceimplementation implements userservice{

	@Autowired
	userrepository urepo;
	@Override
	public String adduser(usersentity user) {
		urepo.save(user);
		return "user created and saved";
	}
	public boolean existemailid(String emailid) {
		if (urepo.findByemailid(emailid)==null) {
			return false;
		}
		else {
			return true;
		}
	}
	@Override
	public boolean validateuser(String emailid, String password) {
		usersentity user = urepo.findByemailid(emailid);
		String db_password = user.getPassword();
		if (db_password.equals(password)) {
			return true;
		}
		else {
		return false;
	}
	}
	@Override
	public String getRole(String emailid) {
		return (urepo.findByemailid(emailid).getRole());
	}
}
