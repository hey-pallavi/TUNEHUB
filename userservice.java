package com.tunehub.services;

import com.tunehub.entities.usersentity;

public interface userservice {
	public String adduser(usersentity user);
	public boolean existemailid(String emailid);
	public boolean validateuser(String emailid,String password);
public String  getRole(String emailid);
}
