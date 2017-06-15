package be.steformations.controle;

import java.util.Scanner;

import be.steformations.model.CompteGeneral;
import be.steformations.model.CompteParticulier;
import be.steformations.vue.VueCompte;

public class Builder {

	static Scanner scan = new Scanner(System.in);
	
	private static int choice;
	
	public static void start() {
		System.out.println(VueCompte.getScreen());
		NewInput();
		switch(choice){
		case 1: CompteGeneral.creer(); 
		break;
		case 2: CompteGeneral.modifier();
		break;
		case 3: CompteGeneral.supprimer();
		break; 
		case 4: CompteGeneral.lister();
		break;
		case 5: CompteParticulier.creer();
		break;
		case 6: CompteParticulier.modifier();
		break;
		case 7: CompteParticulier.supprimer();
		break;
		case 8: CompteParticulier.lister();
		break;
		default:
		}
	
	}
	
	
	
	public static void NewInput()
	{
	choice = scan.nextInt();
	}
	
}
