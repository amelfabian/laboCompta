package be.steformations.controle;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import be.steformations.Position;
import be.steformations.vue.VueCompte;

public class ControleurCompteGeneral  {
	

	public Scanner sc = new Scanner(System.in);
	public  boolean sub = false;
	public  String numero = null;
	public  char position ;
	public  String libelle= null;
	VueCompte vue = new VueCompte();

	public void VueGeneral(){
	Scanner scan = new Scanner(System.in);
	ControleurCompteGeneral cptGen = new ControleurCompteGeneral();
	int choix = scan.nextInt();
	switch(choix){
	case 1 : cptGen.creer();
	break;
	case 2: cptGen.modifier();
	break;
	case 3: cptGen.supprimer();
	break; 
	case 4: cptGen.lister();
	break;
	}
		
	}
	public void creer() {

		setSub(sub);
		setNumero(numero);
		setLibelle(libelle);
		getPosition();
		System.out.println(vue.choix());
		char confirme = sc.nextLine().charAt(0);
		if (confirme == 'O') {
			//ListeComptesGenereau.addToList(numero, libelle, position, sub);
			System.out.println("le compte a �t� cr�� avec succ�s.");
	}

		}

	

	public  void lister() {
		System.out.println("ControleurCompteGeneral.lister()");
	}

	public void supprimer() {
		System.out.println("ControleurCompteGeneral.supprimer()");		
	}

	public  void modifier() {
		System.out.println("ControleurCompteGeneral.modifier()");		
	}





	
	public  void setNumero(String numero) {
		
		System.out.println("Quel est le num�ro du compte :");
		numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 6 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 6 chiffres :");
			numero = sc.nextLine();
		while (!sub && (numero.length() < 6 || numero.length() >1)){
			numero = numero + '0';
			this.numero = numero;
		}
		}
		

	}
	public  String getNumero() {

		return numero;
	}
	

	public  void setLibelle(String lib) {
		
		System.out.println("Libell�:");
		libelle = sc.nextLine();
		while (((libelle.equals(null) || libelle.isEmpty() || libelle.matches("[\\s\\t\\n\\r\\f\\v]")))) {
			System.out.println("null, vide, caract�res invisible�:");
			libelle = sc.nextLine();}
		this.libelle = lib;
	}
	public  String getLibelle() {
	
		return libelle;
	}

	

	public  void setPosition(char position) {
	
		System.out.println("Position bilan (a/b/c/d) :");
		position = sc.nextLine().charAt(0);
		while ( (Character.toString(position).matches("[A-D?]"))){
			System.out.println("Position bilan (a/b/c/d) :");
			position = sc.nextLine().charAt(0);
		}
		
		this.position = position;
	}

	public  Character getPosition() {
		return position;
	}
	public  boolean isSub() {
		return sub;
	}

	public  void setSub(boolean sub) {
		System.out.println("Le compte doit-il �tre subdivis� (O/N) ? :");
		Character tmp = sc.nextLine().charAt(0);
		while (!((Character.toUpperCase(tmp) == 'O') || (Character.toUpperCase(tmp) == 'N'))) {
			System.out.println("(O/N) ? :");
			tmp = sc.nextLine().charAt(0);

		}
		if (tmp == 'o' || tmp == 'O') {
			sub = true;
		}
		this.sub = sub;
	}

}