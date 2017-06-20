package be.steformations.controle;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import be.steformations.Position;
import be.steformations.model.CompteGeneral;
import be.steformations.vue.VueCompte;

public class ControleurCompteGeneral  {
	

	public Scanner sc = new Scanner(System.in);
	public  boolean sub = false;
	public  String numero = null;
	public  char position ;
	public  String libelle= null;
	VueCompte vue = new VueCompte();
	
	public ControleurCompteGeneral(){
		super();
	}

	public void VueGeneral(){
	VueCompte vue = new VueCompte();
	System.out.println(vue.getScreenGeneral());
	Scanner scan = new Scanner(System.in);
	CompteGeneral cptGen = new CompteGeneral();
	int choix = scan.nextInt();
	switch(choix){
	case 1 : cptGen.creer();
	break;
	case 2: cptGen.modifier();
	break;
	case 3: cptGen.supprimer();
	break; 
	case 4: cptGen.lister();
	break;
	}
		
	}


	









}