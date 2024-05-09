package com.tunehub.service;

import com.tunehub.entity.User;

public interface UserService {

	public void insertUser(User user);

	public boolean emailExists(User user);

	public String getRoleDetails(User user);

	
	boolean validUser(String email,String password);

	public boolean getRoleDetails(String email);

	public User getUser(String mail);

	public void updateUser(User user);

}
