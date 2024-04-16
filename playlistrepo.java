package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entities.playlist;

public interface playlistrepo extends JpaRepository<playlist, Integer> {

}
