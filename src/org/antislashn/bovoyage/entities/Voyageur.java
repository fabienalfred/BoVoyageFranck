package org.antislashn.bovoyage.entities;

import java.io.Serializable;

public class Voyageur implements Serializable{
	private String civilite;
	private String nom;
	private String prenom;
	
	public Voyageur() {}
	
	
	public Voyageur(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
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
	
}
