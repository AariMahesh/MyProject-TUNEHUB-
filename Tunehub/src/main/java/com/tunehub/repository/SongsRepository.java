package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.Songs;
//import com.tunehub.entity.User;

public interface SongsRepository extends JpaRepository<Songs,Integer>  {

	Songs findByName(String name);

}
