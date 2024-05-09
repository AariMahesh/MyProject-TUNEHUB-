package com.tunehub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Songs {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String link;
	private String artist;
	private String genre;
	@ManyToMany
	private List<Playlist> playlists;
	
	@Override
	public String toString() {
		return "Songs [id=" + id + ", name=" + name + ", link=" + link + ", artist=" + artist + ", genre=" + genre
				+ ", playlists=" + playlists + "]";
	}
	public Songs(int id, String name, String link, String artist, String genre, List<Playlist> playlists) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
		this.artist = artist;
		this.genre = genre;
		this.playlists = playlists;
	}
	public Songs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Playlist> getPlaylists() {
		return playlists;
	}
	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}
	

}
