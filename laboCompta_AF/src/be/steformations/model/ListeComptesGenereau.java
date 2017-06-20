package be.steformations.model;

import java.util.HashMap;

import be.steformations.controle.ControleurCompteGeneral;

public class ListeComptesGenereau {
	private static HashMap<String, CompteGeneral> compteGeneral;

	public ListeComptesGenereau() {
		ListeComptesGenereau.compteGeneral = new HashMap<>();
	}

	public void addToList(String numero, String libelle, char position, boolean sub) {
		// TODO verification pour savoir ou va t'en dispatcher
		if (sub && numero.length() < 6) {
			CompteGeneral cpt = new CompteGeneralSubdivisable(numero, libelle, position, sub);
			compteGeneral.put(numero, cpt);
		} else if (sub && numero.length() == 6) {
			CompteGeneral cpt = new CompteGeneralSubdivisableParticulier(numero, libelle, position, sub);
			compteGeneral.put(numero, cpt);
		} else if (!sub) {
			CompteGeneral cpt = new CompteGeneralNonSubdivisable(numero, libelle, position, sub);
			compteGeneral.put(numero, cpt);
		}
	}
}