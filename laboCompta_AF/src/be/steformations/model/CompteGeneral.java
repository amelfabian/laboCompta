package be.steformations.model;

import java.util.Scanner;

public class CompteGeneral {
	Scanner sc = new Scanner(System.in);
	public CompteGeneral() {
		System.out.println("CompteGeneral.CompteGeneral()");
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
			System.out.println("subdivison");
		}else{
			if(rep.equals("oui")){
				System.out.println("subdivison pas");
			}
			else{
				System.out.println("try again");
			}
		}
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
