package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunehub.entity.Playlist;
//import com.tunehub.entity.Playlist;
import com.tunehub.entity.Songs;
import com.tunehub.service.PlaylistService;
import com.tunehub.service.SongsService;
import org.springframework.ui.Model;
@Controller
public class PlaylistController {
	@Autowired
	PlaylistService pls;
	@Autowired
	SongsService ss;
	@GetMapping("/createplaylists")
	public String createPlaylist(Model model)
	{
		List<Songs> songs=ss.fetchAllSongs();
		model.addAttribute("songs", songs);
		System.out.println(songs);
		return "createplaylist";
	}
	@PostMapping("/addplaylist")
	public String addPlaylist(@ModelAttribute Playlist playlist )
	{
		
	
			System.out.println(playlist);
			pls.addPlaylist(playlist);
	//updating thw song_playlists table;
			List<Songs> songs=playlist.getSongs();
			for(Songs song:songs)
			{
				song.getPlaylists().add(playlist);
				ss.updateSong(song);
			}
		   return "adminhome";
	}
	@GetMapping("/viewPlaylists")
	public String viewPlaylist(Model model)
	{
		List<Playlist> playlists=pls.getAllPlayLists();
		model.addAttribute("playlists",playlists);
		System.out.println(playlists);
		return "viewplaylist";
		
	}

}
