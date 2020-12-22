package com.Project.Roulette.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Roulette.Document.Users;
import com.Project.Roulette.Repository.UsersRep;

@RestController
@RequestMapping("/Roulette")
public class UsersController {

	@GetMapping("")
	public String index()
	{
		return "index";
	}
	
	@Autowired
	private UsersRep usersRep;
	
	@PostMapping("/saveUser")
	private Users saveUser (@RequestBody Users user)
	{
		return usersRep.saveUser(user);
	}	
	@PostMapping("/listUser")
	public Users listUser(@RequestBody String user)
	{
		return usersRep.findUser(user);
	}
}
