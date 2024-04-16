package com.tunehub.services;

import java.util.List;

import com.tunehub.entities.songs;

public interface songsservice {
public String addsongs(songs song);
public boolean existsong(String songname);
public  List<songs> fetchALLsongs();
}
