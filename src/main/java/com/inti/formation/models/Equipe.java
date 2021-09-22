package com.inti.formation.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
 

@Entity
public class Equipe {
	@Id
	private int id;
	private String nom_equipe;
	private int nombre_joueur;
	
 	 @OneToMany(targetEntity = Joueur.class, fetch = FetchType.LAZY, mappedBy= "equipe",cascade = CascadeType.ALL)
 	 @JsonIgnore
    private List<Joueur> joueurs;

	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipe(int id, String nom_equipe, int nombre_joueur, List<Joueur> joueurs) {
		super();
		this.id = id;
		this.nom_equipe = nom_equipe;
		this.nombre_joueur = nombre_joueur;
		this.joueurs = joueurs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom_equipe() {
		return nom_equipe;
	}

	public void setNom_equipe(String nom_equipe) {
		this.nom_equipe = nom_equipe;
	}

	public int getNombre_joueur() {
		return nombre_joueur;
	}

	public void setNombre_joueur(int nombre_joueur) {
		this.nombre_joueur = nombre_joueur;
	}

	public List<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nom_equipe=" + nom_equipe + ", nombre_joueur=" + nombre_joueur + ", joueurs="
				+ joueurs + "]";
	}
 	 
 	 
 	 
 	 
}
