package be.steformations.model;

public class CompteParticulierNonSubdivisable extends CompteParticulier {
	public String libelle = null;
	public String numero = null;
	public CompteParticulierNonSubdivisable(String libelle,String numero) {
		super();
		this.libelle = libelle;
		this.numero = numero;
	}

}
