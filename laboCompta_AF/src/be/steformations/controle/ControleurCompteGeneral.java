package be.steformations.controle;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import be.steformations.Position;
import be.steformations.model.CompteGeneral;
import be.steformations.vue.VueCompte;

public class ControleurCompteGeneral {

	public Scanner sc = new Scanner(System.in);
	public boolean sub = false;
	public String numero = null;
	public char position;
	public String libelle = null;
	CompteGeneral cptGen = new CompteGeneral();
	VueCompte vue = new VueCompte();

	public ControleurCompteGeneral() {
		super();
	}

	public void VueGeneral() {
		VueCompte vue = new VueCompte();
		System.out.println(vue.getScreenGeneral());
		Scanner scan = new Scanner(System.in);
		CompteGeneral cptGen = new CompteGeneral();
		int choix = scan.nextInt();
		switch (choix) {
		case 1:
			cptGen.creer();
			break;
		case 2:
			cptGen.modifier();
			break;
		case 3:
			cptGen.supprimer();
			break;
		case 4:
			cptGen.lister();
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
		Character tmp = sc.nextLine().charAt(0);
		while (!((Character.toUpperCase(tmp) == 'O') || (Character.toUpperCase(tmp) == 'N'))) {
			System.out.println("(O/N) ? :");
			tmp = sc.nextLine().charAt(0);

		}
		if (tmp == 'o' || tmp == 'O') {
			sub = true;
		}
		cptGen.setSub(sub);
	}

	public void numero() {
		System.out.println("Quel est le numéro du compte :");
		numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
			while (!sub && (numero.length() < 6 || numero.length() > 1)) {
				numero = numero + '0';

			}
			cptGen.setNumero(numero);
		}
	}
}