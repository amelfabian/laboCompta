package be.steformations.model;

import java.util.Scanner;
import java.util.TreeMap;

public class CompteGeneral {
	
	static Scanner sc = new Scanner(System.in);
	public CompteGeneral() {
	}

	public void setValid(boolean b) {
		
	}

	public boolean isValid() {
		
		return true;
	}

	public void creer() {
		
		System.out.println("le compte doit-il être subdiviser (oui/non)?: ");
		String rep = sc.nextLine();
		if(rep.equals("oui")){
			entrerNum();
		}else{
			if(rep.equals("non")){
			 entrerNum();	 
			}
			else{
				System.out.println("try again");
			}
		}
		System.out.println("");
	}
	

	public void entrerNum(){
		System.out.println("Entrez un numéro de compte");
		String num = sc.nextLine();
	}

	public void modifier() {
		System.out.println("CompteGeneral.modifier()");
		
	}

	public void supprimer() {
	System.out.println("CompteGeneral.supprimer()");
		
	}

	public void lister() {
	System.out.println("CompteGeneral.lister()");
		
	}



}
