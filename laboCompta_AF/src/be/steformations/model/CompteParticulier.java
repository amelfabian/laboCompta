package be.steformations.model;

import java.util.Scanner;

import be.steformations.vue.VueCompte;

public class CompteParticulier extends Compte {
	static Scanner sc = new Scanner( System.in);
	private static boolean sub;
	private static char position;
	private static String numero;
	private static String libelle;
	public CompteParticulier() {
	super(libelle,numero);

	}



	public static void creer() {

		Subdivise();
		Numero();
		libelle();
		position();
		System.out.println(VueCompte.choix());
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			ListeComptesGenereau.addToList(numero, libelle, position, sub);
			System.out.println("le compte a été créé avec succès.");
		}
	}

	private static void position() {
		// TODO Auto-generated method stub
		
	}

	private static void libelle() {
		// TODO Auto-generated method stub
		
	}

	private static void Numero() {
		// TODO Auto-generated method stub
		
	}

	private static void Subdivise() {
		// TODO Auto-generated method stub
		
	}

	public static void modifier() {
		System.out.println("CompteParticulier.modifier()");
	}

	public static void supprimer() {
		System.out.println("CompteParticulier.supprimer()");
	}

	public static void lister() {
		System.out.println("CompteParticulier.lister()");
	}

}
