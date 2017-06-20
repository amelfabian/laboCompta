package be.steformations;

import java.util.Scanner;

import be.steformations.controle.Builder;


public class Main {



	private static Scanner sc;

	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		Builder b = new Builder();
		
		System.out.println("Commencé (O/N) ? :");
		Character sub =  sc.nextLine().charAt(0);

		while (Character.toUpperCase(sub) == 'O')  {
			b.Start();
			System.out.println("Continuer (O/N) ? :");
			sub =  sc.nextLine().charAt(0);

		}
		System.out.println("Dazvidaniya !!!");
	

	}
}


