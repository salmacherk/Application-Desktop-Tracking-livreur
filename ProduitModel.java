package models;

import java.sql.Date;

public class ProduitModel {
	int id;
	String nom;
	String description;
	String prix_unitaire;
	String quantit�;
	Date date_ajout ; 
	
public ProduitModel(int id , String nom , String description , String prix_unitaire , String quantit� , Date date_ajout){
	this.id=id;
	this.nom=nom;
	this.description=description;
	this.prix_unitaire=prix_unitaire;
	this.quantit�=quantit�;
	this.date_ajout=date_ajout;
	
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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPrix_unitaire() {
	return prix_unitaire;
}

public void setPrix_unitaire(String prix_unitaire) {
	this.prix_unitaire = prix_unitaire;
}

public String getQuantit�() {
	return quantit�;
}

public void setQuantit�(String quantit�) {
	this.quantit� = quantit�;
}

public Date getDate_ajout() {
	return date_ajout;
}

public void setDate_ajout(Date date_ajout) {
	this.date_ajout = date_ajout;
}

	

}
