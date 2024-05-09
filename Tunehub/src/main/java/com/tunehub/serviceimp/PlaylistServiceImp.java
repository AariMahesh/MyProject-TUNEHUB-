package com.tunehub.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.Playlist;
import com.tunehub.repository.PlaylistRepository;
import com.tunehub.service.PlaylistService;

@Service
public class PlaylistServiceImp implements PlaylistService {
	@Autowired
	PlaylistRepository plr;

	@Override
	public void addPlaylist(Playlist playlist) {
		// TODO Auto-generated method stub
		plr.save(playlist);
		
	}

	@Override
	public List<Playlist> getAllPlayLists() {
		// TODO Auto-generated method stub
		List<Playlist> playlist=plr.findAll();
		return playlist;
	}

//	@Override
//	public boolean checkPlayList(String str) {
//		// TODO Auto-generated method stub
//		Playlist pl=plr.findByName(str);
//		if(pl!=null)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//		
//	}

}
