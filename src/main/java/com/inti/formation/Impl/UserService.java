package com.inti.formation.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inti.formation.metier.IUserMetier;

import com.inti.formation.models.User;
import com.inti.formation.repositories.IUserRepository;

@Service
public class UserService implements IUserMetier {
	@Autowired
	private IUserRepository repo;
@Override
	public User saveOrUpdateUser(User a) {
		return repo.save(a);
	}
@Override
	public void deleteUser(Long id) {
		repo.deleteById(id);

	}

@Override
	public User getByIdUser(Long id) {
		return repo.findById(id).get();
	}

@Override
	public List<User> gettAllUser() {
		return repo.findAll();
	}

@Override
	public User login(String email, String password) {
		return repo.findByEmailAndPassword(email, password);
	}

}
