package be.steformations.controle;

import java.util.Scanner;
import be.steformations.vue.Vue;

public class Builder {
	int choixMenuG = 0;
	int choixMenuP = 0;
	char continuer = 'O';
	Scanner sc = new Scanner(System.in);
	Vue vue = new Vue();
	
	public void Start() {
		ControleurCompteGeneral ctrlCG = new ControleurCompteGeneral();
		ControleurCompteParticulier cptPart = new ControleurCompteParticulier();

		while (Character.toUpperCase(continuer) == 'O') {
		Vue vue = new Vue();
		System.out.println(vue.getScreenMenu());
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
				cptPart.creer();
				break;
			case 2:
				// CompteParticuluer.modifier();
				break;

			}

			System.out.println("Continuer (O/N) ? :");
			continuer = sc.nextLine().charAt(0);
		}
		System.out.println("Au revoir.");
	}
}
