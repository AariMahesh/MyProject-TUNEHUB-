package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.tunehub.entity.Songs;
import com.tunehub.service.SongsService;

@Controller
public class SongsController {
	@Autowired
	SongsService ss;
	
	@PostMapping("/addsong")
	public String addSong(@ModelAttribute Songs song)
	{
		boolean status=ss.checkSongExists(song);
		if(status)
		{
			System.out.println("you cann't add this song :");
			
			
		}
		else
		{
			ss.addSong(song);
		}
		return "adminhome";
		
	}
	@GetMapping("/playSong")
	public String playSongs(Model model)
	{
		boolean premium=true;
		if(premium)
		{
			List<Songs> songs=ss.fetchAllSongs();
			model.addAttribute("songs", songs);
			System.out.println(songs);
			return "viewsong";
		}
		else
		{
			return "pay";
		}
		
	}
	@GetMapping("/viewSong")
	public String viewSongs(Model model)
	{
			List<Songs> songs=ss.fetchAllSongs();
			model.addAttribute("songs", songs);
			System.out.println(songs);
			return "viewsong";
		
		
	}
	

}
