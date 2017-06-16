package be.steformations.controle;

import java.util.Scanner;

import be.steformations.model.CompteGeneral;
import be.steformations.model.CompteParticulier;
import be.steformations.vue.VueCompte;

public class Builder {

	public void start() {
		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println(VueCompte.getScreen());
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			CompteGeneral.creer();
			break;
		case 2:
			CompteGeneral.modifier();
			break;
		case 3:
			CompteGeneral.supprimer();
			break;
		case 4:
			CompteGeneral.lister();
			break;
		case 5:
			CompteParticulier.creer();
			break;
		case 6:
			CompteParticulier.modifier();
			break;
		case 7:
			CompteParticulier.supprimer();
			break;
		case 8:
			CompteParticulier.lister();
			break;
		default:
		}

	}

}
