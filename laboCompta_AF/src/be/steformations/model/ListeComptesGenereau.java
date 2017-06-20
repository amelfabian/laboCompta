package be.steformations.model;

import java.util.HashMap;

public class ListeComptesGenereau {
	private static HashMap<String, CompteGeneral> compteGeneral;

	public ListeComptesGenereau() {
		ListeComptesGenereau.compteGeneral = new HashMap<>();
	}

	public void addToList(CompteGeneral cptGen) {
		String numero = cptGen.getNumero();
		String libelle = cptGen.getLibelle();
		char position = cptGen.getPosition();
		boolean sub = cptGen.isSub();
		if (sub && numero.length() < 6 ){
		CompteGeneral cpt = new CompteGeneralSubdivisable (numero, libelle, position, sub);
		compteGeneral.put(numero,cpt);
		}else if (sub && numero.length() == 6 ){
			CompteGeneral cpt = new CompteGeneralSubdivisableParticulier (numero, libelle, position, sub);
			compteGeneral.put(numero,cpt);
		}else if (!sub){
			CompteGeneral cpt = new CompteGeneralNonSubdivisable (numero, libelle, position, sub);
			compteGeneral.put(numero,cpt);
		}
	}

	public void addToList(CompteParticulier cptPart) {
		// TODO Auto-generated method stub
		
	}
}