package be.steformations.controle;

import java.util.Scanner;

import be.steformations.modele.Compte;
import be.steformations.modele.CompteParticulier;
import be.steformations.vue.Vue;

public class ControleurCompteParticulier {
	private Scanner sc = new Scanner(System.in);
	public void VueParticulier() {
		CompteParticulier cptPart = new CompteParticulier();
		Vue vue = new Vue();
		System.out.println(Vue.getScreenParticulier());
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			cptPart.creer();
			break;
		case 2:
			cptPart.modifier();
			break;
		case 3:
			cptPart.supprimer();
			break;
		case 4:
			cptPart.lister();
			break;
		default:
		}

	}

}
