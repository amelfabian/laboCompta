package be.steformations.controle;

import java.util.Scanner;

import be.steformations.vue.VueCompte;

public class Builder {


	
	private static int choice;
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		ControleurCompteGeneral cptGen = new ControleurCompteGeneral();
		ControleurCompteParticulier cptPart = new ControleurCompteParticulier();
		VueCompte vue = new VueCompte();
		System.out.println(vue.getScreen());
		choice = scan.nextInt();
		switch(choice){
		case 1: cptGen.creer(); 
		break;
		case 2: cptGen.modifier();
		break;
		case 3: cptGen.supprimer();
		break; 
		case 4: cptGen.lister();
		break;
		case 5: cptPart.creer();
		break;
		case 6: cptPart.modifier();
		break;
		case 7: cptPart.supprimer();
		break;
		case 8: cptPart.lister();
		break;
		default:
		}

	}
}
