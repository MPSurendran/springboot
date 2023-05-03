package com.example.ebook.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ebook.Model.Login;
import com.example.ebook.Repository.LoginRepository;



@Service
public class LoginService {
	@Autowired
	LoginRepository userRepo;
public Login saveUser(Login u)
{
 return userRepo.save(u);
}
public String validateUser(String username,String password)
{
	String result="";
	Login u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	
	}

