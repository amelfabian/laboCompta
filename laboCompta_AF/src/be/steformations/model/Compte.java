package be.steformations.model;

public class Compte {
	protected static  String numero = null;
	protected  String libelle= null;
	public Compte(String num,String lib){
		this.numero = num;
		this.setLibelle(lib);
	}
	public  String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public  String getNumero() {
		return numero;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}

}
