package be.steformations.modele;

import java.util.Scanner;

import be.steformations.vue.Vue;

public class CompteParticulier extends Compte {
	public Scanner sc = new Scanner(System.in);
	public boolean sub = false;
	public String numero = null;
	public char position;
	public String libelle = null;
	Vue vue = new Vue();

	public CompteParticulier() {
		super();
	}

	public void creer() {
		CompteParticulier cptPart = new CompteParticulier();
		Subdivise();
		getNumero();
		libelle();
		getPosition();
		Vue vue = new Vue();
		System.out.println(vue.AfficheCompteAvantConfirmerCp(cptPart));
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			ListeComptesGeneraux lcg = new ListeComptesGeneraux();
			lcg.addToList(cptPart);
			System.out.println("le compte a �t� cr�� avec succ�s.");
		}
	}

	public char getPosition() {
		return position;
		// TODO Auto-generated method stub

	}

	private void libelle() {
		// TODO Auto-generated method stub

	}

	public String getNumero() {
		return numero;
	}

	private void Subdivise() {
		// TODO Auto-generated method stub

	}

	public void modifier() {
		System.out.println("CompteParticulier.modifier()");
	}

	public void supprimer() {
		System.out.println("CompteParticulier.supprimer()");
	}

	public void lister() {
		System.out.println("CompteParticulier.lister()");
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLibelle(String libelle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNumero(String numero) {
		// TODO Auto-generated method stub

	}

	public boolean isSub() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getComptGenSub() {
		// TODO Auto-generated method stub
		return null;
	}

}
