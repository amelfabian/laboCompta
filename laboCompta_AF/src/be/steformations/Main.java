package be.steformations;

import java.util.Scanner;

import be.steformations.controle.Builder;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Builder b = new Builder();
		b.Start();

	}

}
