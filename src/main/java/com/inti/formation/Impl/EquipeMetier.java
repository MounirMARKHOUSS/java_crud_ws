package com.inti.formation.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IEquipeMetier;
import com.inti.formation.models.Equipe;
import com.inti.formation.repositories.IEquipeRepository;

@Service
public class EquipeMetier implements IEquipeMetier {
	@Autowired
	private IEquipeRepository repo;
	
	@Override
	public Equipe saveOrUpdate(Equipe e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public void delete(int id) {
          repo.deleteById(id);		
	}

	@Override
	public Equipe getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Equipe> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
