package be.steformations.model;

import java.util.HashMap;


public class ListeComptesGenereau {
	private static HashMap<String, ControleurCompteGeneral> compteGeneral;
	
	public ListeComptesGenereau (){
	ListeComptesGenereau.compteGeneral = new HashMap<>();
	}
	
	//public static void addToList(String numero, String libelle, char position, boolean sub) {
		// TODO verification pour savoir ou va t'en dispatcher
		//if (sub && numero.length() < 6 ){
		//ControleurCompteGeneral cpt = new CompteGeneralSubdivisable (numero, libelle, position, sub);
		//compteGeneral.put(numero,cpt);
		//}else if (sub && numero.length() == 6 ){
		//	ControleurCompteGeneral cpt = new CompteGeneralSubdivisableParticulier (numero, libelle, position, sub);
		//	compteGeneral.put(numero,cpt);
		//}else if (!sub){
		//	ControleurCompteGeneral cpt = new CompteGeneralNonSubdivisable (numero, libelle, position, sub);
		//	compteGeneral.put(numero,cpt);
		//}
	//}
}