package be.steformations.model;

public abstract class Compte {

	protected String numero;
	protected String libelle;
	public Compte(){
		this.numero = null;
		this.libelle = null;
	}
	public abstract  String getLibelle();
	public abstract void setLibelle(String libelle);
	public abstract  String getNumero();
	public abstract void setNumero(String numero);

}
