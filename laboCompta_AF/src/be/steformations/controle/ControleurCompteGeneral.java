package be.steformations.controle;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import be.steformations.Position;
import be.steformations.model.CompteGeneral;
import be.steformations.model.ListeComptesGenereau;
import be.steformations.vue.Vue;

public class ControleurCompteGeneral {

	private Scanner sc = new Scanner(System.in);
	private boolean sub = false;
	private String numero = null;
	private char position;
	private String libelle = null;
	CompteGeneral cptGen = new CompteGeneral();
	Vue vue = new Vue();

	public ControleurCompteGeneral() {
		super();
	}

	public void creer() {
		CompteGeneral cptGen = new CompteGeneral();
		subdivisable();
		numero();
		libelle();
		position();
		System.out.println(vue.choix(cptGen));
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			ListeComptesGenereau lcg = new ListeComptesGenereau();
			lcg.addToList(cptGen);
			System.out.println("le compte a été créé avec succès.");
		}

	}
	
	public void VueGeneral() {
		Vue vue = new Vue();
		System.out.println(vue.getScreenGeneral());
		Scanner scan = new Scanner(System.in);
		int choix = scan.nextInt();
		switch (choix) {
		case 1:
			creer();
			break;
		case 2:
			modifier();
			break;
		case 3:
			supprimer();
			break;
		case 4:
			lister();
			break;
		}

	}

	public void position() {
		System.out.println("Position bilan (a/b/c/d) :");
		position = sc.nextLine().charAt(0);
		while ((Character.toString(position).matches("[A-D?]"))) {
			System.out.println("Position bilan (a/b/c/d) :");
			position = sc.nextLine().charAt(0);
		}
		cptGen.setPosition(position);
	}

	public void libelle() {
		System.out.println("Libellé :");
		libelle = sc.nextLine();
		while (((libelle.equals(null) || libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]")))) {
			System.out.println("null, vide, caractères invisible :");
			libelle = sc.nextLine();
		}
		cptGen.setLibelle(libelle);
	}

	public void subdivisable() {
		System.out.println("Le compte doit-il être subdivisé (O/N) ? :");
		Character sub = sc.nextLine().charAt(0);

		while ((Character.toUpperCase(sub) != 'O') && (Character.toUpperCase(sub) != 'N')) {
			System.out.println("(O/N) ? :");
			sub = sc.nextLine().charAt(0);

		}
		if (sub == 'o' || sub == 'O') {
		cptGen.setSub(true);
		}
	}

	public void numero() {
		System.out.println("Quel est le numéro du compte :");
		numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
			}
		while (!sub && (numero.length() < 6 )) {
				numero = numero + '0';
			}
		cptGen.setNumero(numero);
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
