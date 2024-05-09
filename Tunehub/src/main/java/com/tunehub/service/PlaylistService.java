package com.tunehub.service;

import java.util.List;

import com.tunehub.entity.Playlist;

public interface PlaylistService {

	void addPlaylist(Playlist playlist);

	List<Playlist> getAllPlayLists();

	

}
