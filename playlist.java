package com.tunehub.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class playlist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	int id;
	String songname;
	@ManyToMany
	List<songs>songs;
	public playlist() {
		super();
	}
	public playlist(int id, String songname, List<com.tunehub.entities.songs> songs) {
		super();
		this.id = id;
		this.songname = songname;
		this.songs = songs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public List<songs> getSongs() {
		return songs;
	}
	public void setSongs(List<songs> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "playlist [id=" + id + ", songname=" + songname + ", songs=" + songs + "]";
	}
	
}
