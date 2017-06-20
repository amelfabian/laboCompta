package be.steformations.controle;

import java.util.Scanner;

import be.steformations.model.Compte;
import be.steformations.model.CompteParticulier;
import be.steformations.vue.VueCompte;

public class ControleurCompteParticulier {
	static Scanner sc = new Scanner( System.in);
    public String numero;
    public String libelle;
	
	public void VueParticulier() {
		Scanner scan = new Scanner(System.in);
		CompteParticulier cptPart = new CompteParticulier(numero, libelle);
		VueCompte vue = new VueCompte();
		System.out.println(vue.getScreenParticulier());
		int choice = scan.nextInt();
		switch(choice){

		case 1: cptPart.creer();
		break;
		case 2: cptPart.modifier();
		break;
		case 3: cptPart.supprimer();
		break;
		case 4: cptPart.lister();
		break;
		default:
		}

	}


	
}
