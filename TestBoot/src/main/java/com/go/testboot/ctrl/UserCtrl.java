package com.go.testboot.ctrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.go.testboot.dao.UserDao;
import com.go.testboot.model.Users;

@RestController("/")
public class UserCtrl {
	

	@Autowired
	UserDao users;
	
	@RequestMapping("/add")
	public  @ResponseBody String createUser(@RequestBody Users use)
	{
		users.save(use);
		return "Saved sucess";
	}
	
	@RequestMapping("/getall")
	public  @ResponseBody Iterable<Users> getUsers()
	{
		return users.findAll();
		
	}
	
	

}
