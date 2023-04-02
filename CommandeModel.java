package models;

import java.sql.Date;



public class CommandeModel {
	
	int id;
	Date date_commande;
	 String adresse_client;
	 String nom_client;
	 String km;
	 String produit;
	

public CommandeModel(int id,Date date_commande, String adresse_client,
		String nom_client, String km, String produit) {
	this.id=id;
	this.date_commande = date_commande;
	this.adresse_client = adresse_client;
	this.nom_client = nom_client;
	this.km = km;
	this.produit = produit;
	
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



public Date getDate_commande() {
	return date_commande;
}


public void setDate_commande(Date date_commande) {
	this.date_commande = date_commande;
}


public String getAdresse_client() {
	return adresse_client;
}


public void setAdresse_client(String adresse_client) {
	this.adresse_client = adresse_client;
}


public String getNom_client() {
	return nom_client;
}


public void setNom_client(String nom_client) {
	this.nom_client = nom_client;
}


public String getKm() {
	return km;
}


public void setKm(String km) {
	this.km = km;
}


public String getProduit() {
	return produit;
}


public void setProduit(String produit) {
	this.produit = produit;
}
}
