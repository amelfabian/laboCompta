package be.steformations.vue;

import be.steformations.controle.ControleurCompteGeneral;
import be.steformations.model.CompteGeneral;

public class VueCompte {	
	
		private  StringBuilder menu;
		
		public StringBuilder getScreenMenu(){
			menu = new StringBuilder();
			menu.append(String.format("Menu"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("_______________     "));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));		
			menu.append(String.format(" 1.compte général"   ));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	2.compte particulier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	3.écriture"         ));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Entrez votre choix: "));
			return menu;
			
		}
		public String getScreenGeneral() {
			
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
			menu.append(String.format("Entrez votre choix: "));
			return menu.toString();
			
		}
		
		public StringBuilder getScreenParticulier(){
			menu = new StringBuilder();
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
			return menu;
		}
		
		public  String choix (){
			menu = new StringBuilder();
			CompteGeneral cptgen= new CompteGeneral();
		    
			menu.append(String.format("Vos choix :"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Création d'un compte général."));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Numero : " + cptgen.getNumero()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Libellé : " + cptgen.getLibelle()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Position dans le bilan : " + cptgen.getPosition()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "subdivisible : " + cptgen.isSub()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Confirmer (O/N) :"));
			return menu.toString();
			
		}
}


