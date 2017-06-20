package be.steformations.model;

import java.util.Scanner;

import be.steformations.vue.VueCompte;

public class CompteParticulier extends Compte {
	public Scanner sc = new Scanner(System.in);
	public boolean sub = false;
	public String numero = null;
	public char position;
	public String libelle = null;
	VueCompte vue = new VueCompte();
	CompteParticulier cptPart = new CompteParticulier();

	public CompteParticulier() {
		super();
	}

	public void creer() {
	
		Subdivise();
		getNumero();
		libelle();
		getPosition();
		VueCompte vue = new VueCompte();
		System.out.println(vue.choix(cptPart));
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			ListeComptesGenereau lcg = new ListeComptesGenereau();
			lcg.addToList(cptPart);
			System.out.println("le compte a été créé avec succès.");
		}
	}

	private void getPosition() {
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

}
