package com.go.testboot.ctrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	

	@PostMapping("/add")
	public  @ResponseBody String createUser(@RequestBody Users use)
	{
		users.save(use);
		return "Saved sucess";
	}
	
	@GetMapping("/getall")
	public  @ResponseBody Iterable<Users> getUsers()
	{
		return users.findAll();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public  @ResponseBody String deleteUser(@PathVariable String id)
	{
	    
		users.deleteById(id);

		return "deleted sucess";
	}
	
	

}
