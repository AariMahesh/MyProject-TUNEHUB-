package com.tunehub.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.Songs;
import com.tunehub.repository.SongsRepository;
import com.tunehub.service.SongsService;

@Service
public class SongsServiceImp implements SongsService {
	@Autowired
	SongsRepository sr;

	@Override
	public void addSong(Songs song) {
		// TODO Auto-generated method stub
	  sr.save(song);
	}

	@Override
	public boolean checkSongExists(Songs song) {
		// TODO Auto-generated method stub
		Songs s=sr.findByName(song.getName());
		if(s!=null)
		{
			System.out.println("Song Exists");
			return true;
		}
		else
		{
			System.out.println("Song not exists add your song");
			return false;
		}
		
	}

	@Override
	public List<Songs> fetchAllSongs() {
		// TODO Auto-generated method stub
		List<Songs> s=sr.findAll();
		return s;
	}

	@Override
	public void updateSong(Songs song) {
		// TODO Auto-generated method stub
		sr.save(song);
	}
	

}
