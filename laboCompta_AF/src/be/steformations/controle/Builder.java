package be.steformations.controle;

import java.util.Scanner;
import be.steformations.model.Ecriture;
import be.steformations.vue.Vue;

public class Builder {


	
	public void Start(){
		Vue vue = new Vue();
		System.out.println(vue.getScreenMenu());
		ControleurCompteGeneral cptGen = new ControleurCompteGeneral();
		ControleurCompteParticulier cptPart = new ControleurCompteParticulier();
		Ecriture ecrit = new Ecriture();
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice){
		case 1 : cptGen.VueGeneral();
		break;
		case 2 : cptPart.VueParticulier();
		break;
		case 3 : ecrit.VueEcriture();
		}
	}
	

	

}
