package com.spring.jpy.sql.sjs.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpy.sql.sjs.model.Users;
import com.spring.jpy.sql.sjs.repository.UsersRespository;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	@Autowired
	UsersRespository usersRespository;
	
	@GetMapping("/all")
	public List<Users> getAll(){
		return usersRespository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Optional<Users> getId(@PathVariable("id") final Integer id){
		return usersRespository.findById(id);
	}
	
	@GetMapping("/new/{name}&{salary}&{teamid}")
	public Users newUser(@PathVariable("name") final String name, @PathVariable("salary") final Integer salary, @PathVariable("teamid") final Integer teamid){
		
		Users user = new Users();
		user.setName(name);
		user.setSalery(salary);
		user.setTeamName(teamid);
		return usersRespository.save(user);
	}
	
	@GetMapping("/update/{id}/{name}")
	public Users updateUser(@PathVariable("id") final Integer id, @PathVariable("name") final String name){
		Users user = usersRespository.getOne(id);
		user.setName(name);
		return usersRespository.save(user);
	}

}
