package com.appdeveloperblog.ws.uicontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class Usercontroller {
	
	@GetMapping
	public String getUser()
	{
		return "get user was called";
	}
	@PostMapping
	public String createuser()
	{
		return "create user called";
	}
    @PutMapping
    public String Updateuser()
    {
    	return "update was called";
    }
    @DeleteMapping
    public String deleteuser()
    {
    	return "delete user called";
    }
}

