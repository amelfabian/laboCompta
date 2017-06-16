package be.steformations.controle;

import java.util.Scanner;

import be.steformations.model.Compte;
import be.steformations.vue.VueCompte;

public class ControleurCompteParticulier extends Compte {
	static Scanner sc = new Scanner( System.in);
	private  boolean sub;
	private  char position;
	private static String libelle;
	private static String numero;
	public ControleurCompteParticulier() {
		super(libelle,numero);
		
	

	}



	public void creer() {

		Subdivise();
		Numero();
		libelle();
		position();
		System.out.println(VueCompte.choix());
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			//ListeComptesGenereau.addToList(numero, libelle, position, sub);
			System.out.println("le compte a été créé avec succès.");
		}
	}

	private  void position() {
		// TODO Auto-generated method stub
		
	}

	private  void libelle() {
		// TODO Auto-generated method stub
		
	}

	private  void Numero() {
		// TODO Auto-generated method stub
		
	}

	private  void Subdivise() {
		// TODO Auto-generated method stub
		
	}

	public void modifier() {
		System.out.println("CompteParticulier.modifier()");
	}

	public  void supprimer() {
		System.out.println("CompteParticulier.supprimer()");
	}

	public  void lister() {
		System.out.println("CompteParticulier.lister()");
	}

}
