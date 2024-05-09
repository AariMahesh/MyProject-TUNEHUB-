package com.tunehub.service;

//import com.tunehub.controller.List;
import com.tunehub.entity.Songs;
import java.util.*;

public interface SongsService {

	public void addSong(Songs song);

	public boolean checkSongExists(Songs song);

	public List<Songs> fetchAllSongs();

	public void updateSong(Songs song);

}
