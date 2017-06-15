package be.steformations.controle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

import be.steformations.model.CompteGeneralNonSubdivisable;
import be.steformations.model.CompteParticulier;
import be.steformations.vue.VueCompte;

public class ControleCompte {

	static Scanner scan = new Scanner(System.in);
	static CompteGeneralNonSubdivisable cptgen = new CompteGeneralNonSubdivisable();
	static CompteParticulier cptpart = new CompteParticulier();
	
	private static int choice;
	
	public static void start() {
		System.out.println(VueCompte.getScreen());
		NewInput();
		switch(choice){
		case 1: cptgen.creer(); 
		break;
		case 2: cptgen.modifier();
		break;
		case 3: cptgen.supprimer();
		break;
		case 4: cptgen.lister();
		break;
		case 5: cptpart.creer();
		break;
		case 6: cptpart.modifier();
		break;
		case 7: cptpart.supprimer();
		break;
		case 8: cptpart.lister();
		break;
		default:
		}
	
	}
	
	
	
	public static void NewInput()
	{
	choice = scan.nextInt();
	}
	
}
