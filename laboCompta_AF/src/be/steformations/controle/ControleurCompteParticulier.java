package be.steformations.controle;

import java.util.Scanner;

import be.steformations.model.Compte;
import be.steformations.model.CompteParticulier;
import be.steformations.vue.VueCompte;

public class ControleurCompteParticulier {
	private Scanner sc = new Scanner(System.in);
	public void VueParticulier() {
		CompteParticulier cptPart = new CompteParticulier();
		VueCompte vue = new VueCompte();
		System.out.println(VueCompte.getScreenParticulier());
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
