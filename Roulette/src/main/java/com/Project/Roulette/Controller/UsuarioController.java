package com.Project.Roulette.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Roulette.Document.Users;
import com.Project.Roulette.Repository.UsersRep;

@RestController
@RequestMapping("/user")
public class UsuarioController {
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
