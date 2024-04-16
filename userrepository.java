package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entities.usersentity;

public interface userrepository extends JpaRepository<usersentity, Integer>{
public usersentity findByemailid(String emailid );
}

