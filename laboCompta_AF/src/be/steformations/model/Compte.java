package be.steformations.model;

public abstract class Compte {

	private String numero;
	private String libelle;
	public Compte(){
		this.numero = null;
		this.libelle = null;
	}
	public abstract  String getLibelle();
	public abstract void setLibelle(String libelle);
	public abstract  String getNumero();
	public abstract void setNumero(String numero);

}
