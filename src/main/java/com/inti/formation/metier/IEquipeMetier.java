package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Equipe;
//@FunctionalInterface
public interface IEquipeMetier {
	public Equipe saveOrUpdate (Equipe e);
	public void delete (int id);
	public Equipe getById(int id);
	public List <Equipe> getAll();
}
