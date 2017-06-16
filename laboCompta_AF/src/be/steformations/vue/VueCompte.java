package be.steformations.vue;

import be.steformations.model.ControleurCompteGeneral;

public class VueCompte {	
	
		private static StringBuilder menu;
		public static String getScreen() {
			
			menu = new StringBuilder();
			menu.append(String.format("Menu compte"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("_______________     "));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(" .compte général"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	1.créer"));
			menu.append(String.format(System.lineSeparator()));;
			menu.append(String.format("	2.Modifier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	3.Supprimer"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	4.Lister"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(" .compte particulier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	5.créer"));
			menu.append(String.format(System.lineSeparator()));;
			menu.append(String.format("	6.Modifier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	7.Supprimer"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	8.Lister"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Entrez votre choix: "));
			return menu.toString();
			
		}
		
		public static String choix (){
			menu = new StringBuilder();
			ControleurCompteGeneral cptgen= new ControleurCompteGeneral();
			menu.append(String.format("Vos choix :"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Création d'un compte général."));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Numero : " + cptgen.numero));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Libellé : " + cptgen.libelle));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Position dans le bilan : " + cptgen.position));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "subdivisible : " + cptgen.sub));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Confirmer (O/N) :"));
			return menu.toString();
			
		}
}


