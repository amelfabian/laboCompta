package be.steformations.modele;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ListeComptesGeneraux {
	private HashMap<String, CompteGeneral> compteGeneral;

	public ListeComptesGeneraux() {
		this.compteGeneral = new HashMap<>();
	}

	public boolean addToList(CompteGeneral cmpt) {
		String numero = cmpt.getNumero();
		String libelle = cmpt.getLibelle();
		char position = cmpt.getPosition();
		boolean sub = cmpt.isSub();

		boolean ajouter = false;

		ajouter = ! compteGeneral.containsKey(numero);

		if (ajouter) {
			if (sub && numero.length() < 6) {
				CompteGeneral cpt = new GeneralSubdivisable(numero, libelle, position, sub);
				compteGeneral.put(numero, cpt);
				
			} else if (sub && numero.length() == 6) {
				CompteGeneral cpt = new GeneralSubdivisabkeParticulier(numero, libelle, position, sub);
				compteGeneral.put(numero, cpt);
			} else if (!sub) {
				CompteGeneral cpt = new GeneralNonSubdivisable(numero, libelle, position);
				compteGeneral.put(numero, cpt);
			}
		}
		return ajouter;
	}

	public boolean addToList(CompteParticulier cmptP) {

		return false;

	}

}
