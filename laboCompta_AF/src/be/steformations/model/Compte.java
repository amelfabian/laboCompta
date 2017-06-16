package be.steformations.model;

public class Compte {
	private String numero = null;
	private String libelle= null;
	public Compte(String num,String lib){
		this.numero = num;
		this.libelle = lib;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
