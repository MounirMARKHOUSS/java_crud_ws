package com.inti.formation.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.metier.IUserMetier;
import com.inti.formation.models.User;

 
 
@RestController
@RequestMapping("/apiUser")
@CrossOrigin(origins = "*")
public class UserWebService {
	
	
	@Autowired
	private IUserMetier metier;
	
 

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public User save(@RequestBody User user) {
		
//			Set<Role> roles = null;
//			roles.add(roleservice.findByRoleName(roleName));
//			user.setRoles(roles);
			System.out.println(user);
			System.out.println(metier.saveOrUpdateUser(user));
			return metier.saveOrUpdateUser(user);
			
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		
		return metier.saveOrUpdateUser(user);
	}
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public User getByIdUser(@PathVariable("id") Long id) {
		return metier.getByIdUser(id);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id")Long id) {
		metier.deleteUser(id);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<User> findAll(){
		return metier.gettAllUser();
	}
	
//	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
//	public User signIn(@RequestBody User user){
//		return metier.login(user.getEmail(), user.getPassword());
//	}
	
 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public User login(@PathVariable String email, @PathVariable String password){
		return metier.login(email, password);
	}

	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public User signIn(@RequestBody User user){
		return metier.login(user.getEmail(), user.getPassword());
	}
	

}
