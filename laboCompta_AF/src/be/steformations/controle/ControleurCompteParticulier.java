package be.steformations.controle;

import java.util.Scanner;

import be.steformations.modele.Compte;
import be.steformations.modele.CompteGeneral;
import be.steformations.modele.CompteParticulier;
import be.steformations.modele.ListeComptesGeneraux;
import be.steformations.vue.Vue;

public class ControleurCompteParticulier {
	private Scanner sc = new Scanner(System.in);
	Vue vue = new Vue();
	CompteParticulier comptP = new CompteParticulier();
	ListeComptesGeneraux listeCG = new ListeComptesGeneraux();
	
	public void VueParticulier() {
		System.out.println(vue.getScreenParticulier());
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			comptP.creer();
			break;
		case 2:
			comptP.modifier();
			break;
		case 3:
			comptP.supprimer();
			break;
		case 4:
			comptP.lister();
			break;
		default:
		}

	}
	public void creer() {

		listeCptGenSub();
		Numero();
		Libelle();
		Subdivisable();
		System.out.println(vue.AfficheCompteAvantConfirmerCp(comptP));
		Character confirme = sc.nextLine().charAt(0);
		if (Character.toUpperCase(confirme) == 'O') {
			

		}
		
	}
	private void Subdivisable() {
		// TODO Auto-generated method stub
		
	}
	private void listeCptGenSub() {
		
		System.out.println("Quel est le numéro du compte que vous souhaitez subdiviser?");
	}
	private void Position() {
		// TODO Auto-generated method stub
		
	}
	private void Libelle() {
		// TODO Auto-generated method stub
		
	}
	private void Numero() {
		System.out.println("Quel est le numéro du compte :");
		String numero = sc.nextLine();
		while ((!(numero.matches("[0-9]+"))) || numero.length() > 10 || numero.length() < 1) {
			System.out.println("Uniquement [0-9] et pas plus de 10 chiffres :");
			numero = sc.nextLine();
		}

		while (!(comptP.isSub()) && numero.length() < 10) {
			numero = numero + "0";
		}
		comptP.setNumero(numero);
		
	}


}
