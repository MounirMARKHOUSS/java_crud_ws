package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.models.Equipe;

@Repository
public interface IEquipeRepository extends JpaRepository<Equipe,Integer> {

}
