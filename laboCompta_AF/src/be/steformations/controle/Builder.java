package be.steformations.controle;

import java.util.Scanner;
import be.steformations.vue.Vue;

public class Builder {
	int choixMenuG = 0;
	int choixMenuP = 0;

	public void Start() {
		Vue vue = new Vue();
		System.out.println(vue.getScreenMenu());
		ControleurCompteGeneral ctrlCG = new ControleurCompteGeneral();
		// ControleurCompteParticulier cptPart = new
		// ControleurCompteParticulier();
		Scanner sc = new Scanner(System.in);
		int choix = Integer.parseInt(sc.nextLine());

		switch (choix) {
		case 1:
			System.out.println(vue.getScreenGeneral());
			choixMenuG = Integer.parseInt(sc.nextLine());
			break;
		case 2:
			vue.getScreenParticulier();
			choixMenuP = Integer.parseInt(sc.nextLine());
			break;
		case 3:
			vue.getScreenEcriture();
			choixMenuP = Integer.parseInt(sc.nextLine());
			break;
		}

		switch (choixMenuG) {
		case 1:
			ctrlCG.creer();
			break;
		case 2:
			// CompteGeneral.modifier();
			break;
		}

		switch (choixMenuP) {
		case 1:
			//a remplir après
			break;
		case 2:
			// CompteParticuluer.modifier();
			break;

		}

	}
}
