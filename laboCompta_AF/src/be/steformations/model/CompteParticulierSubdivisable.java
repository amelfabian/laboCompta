package be.steformations.model;

public class CompteParticulierSubdivisable extends CompteParticulier {
	public String libelle = null;
	public String numero = null;
	public CompteParticulierSubdivisable(String libelle, String numero) {
			super();
			this.libelle = libelle;
			this.numero = numero;
	}

}
