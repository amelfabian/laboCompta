package be.steformations.model;

import java.util.Scanner;

import be.steformations.controle.ControleurCompteGeneral;
import be.steformations.vue.VueCompte;

public class CompteGeneral extends Compte {
	public Scanner sc = new Scanner(System.in);

	VueCompte vue = new VueCompte();

	private boolean sub;

	private char position;

	public CompteGeneral() {
		super();
		this.getNumero();
		this.getLibelle();
	}

	public void creer() {
		ControleurCompteGeneral ctrl = new ControleurCompteGeneral();
		ctrl.subdivisable();;
		ctrl.numero();
		ctrl.libelle();
		ctrl.position();
		System.out.println(vue.choix());
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			ListeComptesGenereau lcg = new ListeComptesGenereau();
			lcg.addToList(numero, libelle, position, sub);
			System.out.println("le compte a été créé avec succès.");
		}

	}

	public void setNumero(String numero) {

		this.numero = numero;
	}

	public String getNumero() {

		return numero;
	}

	public void setLibelle(String lib) {

		this.libelle = lib;
	}

	public String getLibelle() {

		return libelle;
	}

	public void setPosition(char position) {

		this.position = position;
	}

	public Character getPosition() {
		return position;
	}

	public boolean isSub() {
		return sub;
	}

	public void setSub(boolean sub) {

		this.sub = sub;
	}

	public void lister() {
		System.out.println("ControleurCompteGeneral.lister()");
	}

	public void supprimer() {
		System.out.println("ControleurCompteGeneral.supprimer()");
	}

	public void modifier() {
		System.out.println("ControleurCompteGeneral.modifier()");
	}

}
