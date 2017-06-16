package be.steformations.controle;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import be.steformations.vue.VueCompte;

public class ControleurCompteGeneral  {
	

	public Scanner sc = new Scanner(System.in);
	private  boolean sub = false;
	private  String numero;
	private  char position;
	private  String libelle;
	VueCompte vue = new VueCompte();

	public void creer() {

		Subdivise();
		setNumero(libelle);
		setLibelle(libelle);
		setPosition(position);
		System.out.println(vue.choix());
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			//ListeComptesGenereau.addToList(numero, libelle, position, sub);
			System.out.println("le compte a été créé avec succès.");
	}

		}

	private  boolean Subdivise() {
		System.out.println("Le compte doit-il être subdivisé (O/N) ? :");
		Character tmp = sc.nextLine().charAt(0);

		while (!((Character.toUpperCase(tmp) == 'O') || (Character.toUpperCase(tmp) == 'N'))) {
			System.out.println("(O/N) ? :");
			tmp = sc.nextLine().charAt(0);

		}
		if (tmp == 'o' || tmp == 'O') {
			setSub(true);
		}
		return isSub();
	}

	

	public  void lister() {
		// TODO Auto-generated method stub
		
	}

	public void supprimer() {
		// TODO Auto-generated method stub
		
	}

	public  void modifier() {
		// TODO Auto-generated method stub
		
	}





	public  String getNumero() {
		return numero;
	}

	public  void setNumero(String numero) {
		this.numero = numero;
		System.out.println("Quel est le numéro du compte :");
		setNumero(sc.nextLine());
		while ((!(getNumero().matches("[0-9]+"))) || getNumero().length() > 6 || getNumero().length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			setNumero(sc.nextLine());
		}

		while (!isSub() && getNumero().length() < 6) {
			setNumero(getNumero() + "0");
		}
	}

	public  String getLibelle() {
		return libelle;
	}

	public  void setLibelle(String lib) {
		this.libelle = lib;
		System.out.println("Libellé :");
		String libelle = sc.nextLine();
		// il laisse passer les espaces et tab
		while ((( libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]") ))){
			System.out.println("null, vide, caractères invisible :");
			libelle = sc.nextLine();
		}
	}

	public  char getPosition() {
		return position;
	}

	public  void setPosition(char position) {
		this.position = position;
		System.out.println("Position bilan (a/b/c/d) :");
		position = sc.nextLine().charAt(0);
		while ( (Character.toString(position).matches("[A-D?]"))){
			System.out.println("Position bilan (a/b/c/d) :");
		}
	}

	public  boolean isSub() {
		return sub;
	}

	public  void setSub(boolean sub) {
		this.sub = sub;
	}

}