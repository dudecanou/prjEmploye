package com.sircus.prjEmploye;
import java.text.NumberFormat;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String prenom,nom;
		int salaire; 
		double pourcent;
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println("Entrez les coordonnees de l'Employe 1");
		System.out.println("");
		System.out.println("Le Prenom =>");
		prenom = sc.nextLine();
		
		System.out.println("");
		System.out.println("Le Nom =>");
		nom = sc.nextLine();
		
		System.out.println("");
		System.out.println("Le Salaire =>");
		salaire = sc.nextInt();
		sc.nextLine();
		
		Employe E1 = new Employe(nom, prenom,salaire);
		
		System.out.println("Entrez les coordonnees de l'Employe 2");
		System.out.println("");
		System.out.println("Le Prenom =>");
		prenom = sc.nextLine();
		
		System.out.println("");
		System.out.println("Le Nom =>");
		nom = sc.nextLine();
		
		System.out.println("");
		System.out.println("Le Salaire =>");
		salaire = sc.nextInt();
		
		Employe E2 = new Employe(nom, prenom, salaire);
		
		System.out.println("");
		System.out.println("**************** Employe 1 ****************");
		System.out.println("");
		System.out.println("Prenom -> "+ E1.getPrenom());
		System.out.println("Nom -> "+ E1.getNom());
		System.out.println("Salaire -> " + nf.format(E1.getSalaire()));
		System.out.println("");
		System.out.println("*******************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("**************** Employe 2 ****************");
		System.out.println("");
		System.out.println("Prenom -> "+ E2.getPrenom());
		System.out.println("Nom -> "+ E2.getNom());
		System.out.println("Salaire -> " + nf.format(E2.getSalaire()));
		System.out.println("");
		System.out.println("*******************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("Quel est le pourcentage de l'augmentation annuel ?");
		pourcent = sc.nextDouble();
		
		System.out.println("");
		System.out.println("**************** Employe 1 ****************");
		System.out.println("");
		System.out.println("Prenom -> "+ E1.getPrenom());
		System.out.println("Nom -> "+ E1.getNom());
		System.out.println("Salaire -> " + nf.format((E1.getSalaire()*(1+(pourcent/100)))));
		System.out.println("");
		System.out.println("*******************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("**************** Employe 2 ****************");
		System.out.println("");
		System.out.println("Prenom -> "+ E2.getPrenom());
		System.out.println("Nom -> "+ E2.getNom());
		System.out.println("Salaire -> " + nf.format((E2.getSalaire()*(1+(pourcent/100)))));
		System.out.println("*******************************************");

		sc.close();

	}

}
