package com.example.ebook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ebook.Model.Sign;
import com.example.ebook.Repository.SignRepository;



@Service
public class SignService {
	@Autowired
	SignRepository ur;
	
	public List<Sign>getUserDetail()
	{
		return ur.findAll();
	}

	public Sign saveUserDetail(Sign u)
	{
		return ur.save(u);
	}
}
