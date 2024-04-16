package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entities.songs;

public interface songsrepo extends JpaRepository<songs, Integer>{
   public songs findBysongname(String songname);
}
