package com.inti.formation.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//@Data @NoArgsConstructor @AllArgsConstructor @ToString 
public class Joueur {
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String jeu;
	private String poids;
	private String taille;
	@ManyToOne
 	@JoinColumn(name = "equipe_id")
    private Equipe equipe;
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joueur(int id, String nom, String prenom, String jeu, String poids, String taille, Equipe equipe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.jeu = jeu;
		this.poids = poids;
		this.taille = taille;
		this.equipe = equipe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getJeu() {
		return jeu;
	}

	public void setJeu(String jeu) {
		this.jeu = jeu;
	}

	public String getPoids() {
		return poids;
	}

	public void setPoids(String poids) {
		this.poids = poids;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		return "Joueur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", jeu=" + jeu + ", poids=" + poids
				+ ", taille=" + taille + ", equipe=" + equipe + "]";
	}
}
