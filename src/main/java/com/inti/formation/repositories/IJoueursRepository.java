package com.inti.formation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.models.Equipe;
import com.inti.formation.models.Joueur;

@Repository
public interface IJoueursRepository extends JpaRepository< Joueur , Integer> {
	  List<Joueur> findByEquipe(Equipe equipe); 
}
