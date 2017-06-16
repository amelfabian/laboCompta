package be.steformations.model;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import be.steformations.vue.VueCompte;

public class CompteGeneral extends Compte {

	public static Scanner sc = new Scanner(System.in);
	public static boolean sub = false;
	public static String numero = "";
	public static char position = ' ';
	public static String libelle;

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

	private static boolean Subdivise() {
		System.out.println("Le compte doit-il être subdivisé (O/N) ? :");
		Character tmp = sc.nextLine().charAt(0);

		while (!((Character.toUpperCase(tmp) == 'O') || (Character.toUpperCase(tmp) == 'N'))) {
			System.out.println("(O/N) ? :");
			tmp = sc.nextLine().charAt(0);

		}
		if (tmp == 'o' || tmp == 'O') {
			sub = true;
		}
		return sub;
	}

	public static String Numero() {
		System.out.println("Quel est le numéro du compte :");
		numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
		}

		while (!sub && numero.length() < 6) {
			numero = numero + "0";
		}
		return numero;
		
	}

	public static void lister() {
		// TODO Auto-generated method stub
		
	}

	public static void supprimer() {
		// TODO Auto-generated method stub
		
	}

	public static void modifier() {
		// TODO Auto-generated method stub
		
	}

	public static String libelle() {
		System.out.println("Libellé :");
		String libelle = sc.nextLine();
		// il laisse passer les espaces et tab
		while ((( libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]") ))){
			System.out.println("null, vide, caractères invisible :");
			libelle = sc.nextLine();
		}return libelle;
	}

	public static char position() {
		System.out.println("Position bilan (a/b/c/d) :");
		char position = sc.nextLine().charAt(0);
		while ( (Character.toString(position).matches("[A-D?]"))){
			System.out.println("Position bilan (a/b/c/d) :");
			 position = sc.nextLine().charAt(0);
		}
		return position;
	}

}