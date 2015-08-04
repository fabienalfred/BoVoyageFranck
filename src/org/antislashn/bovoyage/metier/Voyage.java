package org.antislashn.bovoyage.metier;

import java.io.Serializable;

import org.antislashn.bovoyage.entities.DatesVoyage;

public class Voyage implements Serializable {
	private String region;
	private DatesVoyage datesVoyage;
	private int nbVoyageurs=1;
	
	public double getPrixHT(){
		return nbVoyageurs*datesVoyage.getPrixHT();
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public DatesVoyage getDatesVoyage() {
		return datesVoyage;
	}
	public void setDatesVoyage(DatesVoyage datesVoyage) {
		this.datesVoyage = datesVoyage;
	}
	public int getNbVoyageurs() {
		return nbVoyageurs;
	}
	public void setNbVoyageurs(int nbVoyageurs) {
		this.nbVoyageurs = nbVoyageurs;
	}
	
}
