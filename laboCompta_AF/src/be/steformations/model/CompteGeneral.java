package be.steformations.model;

import java.io.Serializable;
import java.util.Scanner;

public class CompteGeneral extends Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	static Scanner sc = new Scanner(System.in);
	static String rep;
	static Character cara;

		

	public Boolean Subdivisable(String string) {

		boolean valid = false;

		if ((string.length() == 6 && string.matches("[0-9]+"))) {
			valid = true;
		}
		return valid;

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

	public void newInput() {
		System.out.println("Entrez un numéro de compte: ");
		rep = sc.nextLine();
		{
			if (Subdivisable(rep))
				System.out.println("Entrez un nom: ");
			rep = sc.nextLine();
			libele(rep);
		}

	}

	public char position() {
		System.out.println("Position du compte au bilan: ");
		rep = sc.nextLine();
		cara = rep.charAt(0);
		if (positionIsValid(cara)) {
			enregistrement();
		} else {
			cara = 'a';
		}
		return cara;

	}

	public void enregistrement() {
		System.out.println("souhaitez vous enregistrer?");
	}

	public boolean positionIsValid(Character caract) {
		boolean valid = false;
		if (caract.equals('a') || caract.equals('b') || cara.equals('c') || cara.equals('d')) {
			caract.toString();
			valid = true;
		}

		return valid;

	}

	public String libele(String string) {
		if (!(string.equals(null)) && !(string.isEmpty())) {
			position();
		}
		return string;

	}

	public void modifier() {

	}

	public void supprimer() {

	}

	public void lister() {

	}

}
