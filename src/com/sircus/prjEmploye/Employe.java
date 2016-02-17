package com.sircus.prjEmploye;

public class Employe {
	private String prenom;
	private String nom;
	private int salaire; 


//Creation des Getter et Setter -> Source, Generate Getters and Setters

//------ Get, Set Prenom -------
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

//------ Get, Set Nom -------

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

//------ Get, Set Salaire -------
public int getSalaire() {
	return salaire;
}
public void setSalaire(int salaire) {
	this.salaire = salaire;
}

public Employe(){ 
	//System.out.println("Création d'un employe !"); 
	prenom = "Inconnu"; 
	nom = "Inconnu"; 
	salaire = 0; 
	}

public Employe(String pPrenom, String pNom , int pSalaire) { 
	//System.out.println("Création d'un employe avec des paramètres !"); 
	prenom = pPrenom; 
	nom = pNom; 
	salaire = pSalaire; 
	}
}
