package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.User;

 

public interface IUserMetier {
	public User saveOrUpdateUser(User a);
	public  void deleteUser(Long id);
	public User getByIdUser(Long id);
	public List<User> gettAllUser();
	public User login(String email, String password);
}
