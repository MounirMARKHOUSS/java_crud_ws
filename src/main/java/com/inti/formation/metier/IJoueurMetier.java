package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Joueur;

public interface IJoueurMetier {
	public Joueur saveOrUpdate (Joueur j);
	public void delete (int id);
	public Joueur getById(int id);
	public List<Joueur> getAll();
}
