package be.steformations.model;

import java.util.Scanner;

import be.steformations.controle.ControleurCompteGeneral;
import be.steformations.vue.Vue;

public class CompteGeneral extends Compte {
	private String numero;
	private String libelle;
	Vue vue = new Vue();
	private boolean sub;
	private char position;

	public CompteGeneral() {
		this.sub=false;
		this.position=0;
		this.numero="";
		this.libelle="";
	}
	
	public CompteGeneral(String numero2,String libelle2, char position2){
		this.numero = numero2;
		this.libelle = libelle2;
		this.position = position2;
	}


	public void setNumero(String numero) {
		
		this.numero = numero;
	}

	public String getNumero() {

		return numero;
	}

	public void setLibelle(String lib) {

		this.libelle = lib;
	}

	public String getLibelle() {

		return libelle;
	}

	public void setPosition(char position) {

		this.position = position;
	}

	public Character getPosition() {
		return position;
	}

	public boolean isSub() {
		return sub;
	}

	public void setSub(boolean sub) {

		this.sub = sub;
	}



}
