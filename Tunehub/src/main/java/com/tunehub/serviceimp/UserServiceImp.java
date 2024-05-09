package com.tunehub.serviceimp;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.User;
import com.tunehub.service.*;
import com.tunehub.repository.*;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository ur;

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
		ur.save(user);
	}
	@Override
	public boolean emailExists(User user) {
		// TODO Auto-generated method stub
		User eu=ur.findByEmail(user.getEmail());
		if(eu !=null)
		{
			System.out.println("Present");
			return true;
		}
		else
		{
			System.out.println("Absent");
			return false;
		}
		

	}
	@Override
	public String getRoleDetails(User user) {
		// TODO Auto-generated method stub
		User r=ur.findByRole(user.getRole());
		if(r.getRole().toLowerCase().equals("admin"))
		{
			return "admin";
		}
		else
		{
			return "customer";
		}
	}
	
	@Override
	public boolean validUser(String email, String password) {
		// TODO Auto-generated method stub
		User byEmail = ur.findByEmail(email);
		String pass=byEmail.getPassword();
		if(password.equals(pass))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	@Override
	public boolean getRoleDetails(String email) {
		// TODO Auto-generated method stub
		User byEmail = ur.findByEmail(email);
		String Role=byEmail.getRole().toLowerCase();
		if(Role.equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public User getUser(String mail) {
		// TODO Auto-generated method stub
		return ur.findByEmail(mail);
		//return null;
	}
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		ur.save(user);
		
	}

}
