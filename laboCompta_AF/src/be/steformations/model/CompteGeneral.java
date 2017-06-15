package be.steformations.model;

import java.util.Scanner;
import java.util.TreeMap;

public class CompteGeneral {

	static Scanner sc = new Scanner(System.in);
	static String rep;

	public CompteGeneral() {
	}

	public void setValid(boolean b) {

	}

	public boolean isValid() {

		return true;
	}

	public void creer() {

		System.out.println("le compte doit-il être subdiviser (oui/non)?: ");
		rep = sc.nextLine();
		do {

			if (rep.equals("oui")) {
				newInput();
				break;
			} else {
				if (rep.equals("non")) {
					newInput();
					break;
				} else {
					System.out.println("try again");
					System.out.println("le compte doit-il être subdiviser (oui/non)?: ");
					rep = sc.nextLine();
				}
			}

		} while (!(rep.equals("oui")) && (!(rep.equals("oui"))));

	}

	public int sizeNum(String string) {
		int cpt = 0;
		while (string.substring(cpt).equalsIgnoreCase(null)) {
			string.substring(cpt);
		}
		return cpt;

	}

	public void newInput() {
		System.out.println("Entrez un numéro de compte");
		rep = sc.nextLine();
		if (sizeNum(rep) > 1 || sizeNum(rep) < 6) {
			System.out.println("entrez le nom");
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
