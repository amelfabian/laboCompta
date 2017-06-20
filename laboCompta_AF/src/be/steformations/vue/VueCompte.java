package be.steformations.vue;

import be.steformations.controle.ControleurCompteGeneral;
import be.steformations.model.CompteGeneral;
import be.steformations.model.CompteParticulier;

public class VueCompte {	
	
		private static  StringBuilder menu;
		
		public static StringBuilder getScreenMenu(){
			menu = new StringBuilder();
			menu.append(String.format("Menu"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("_______________     "));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));		
			menu.append(String.format(" 1.compte g�n�ral"   ));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	2.compte particulier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	3.�criture"         ));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Entrez votre choix: "));
			return menu;
			
		}
		public static String getScreenGeneral() {
			
			menu = new StringBuilder();
			menu.append(String.format("Menu compte"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("_______________     "));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(" .compte g�n�ral"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	1.cr�er"));
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
		
		public static  StringBuilder getScreenParticulier(){
			menu = new StringBuilder();
			menu.append(String.format(" .compte particulier"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("	5.cr�er"));
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
		
		public   String choix (CompteGeneral pCmptG){
			menu = new StringBuilder();
		    
			menu.append(String.format("Vos choix :"));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Cr�ation d'un compte g�n�ral."));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Numero : " +  pCmptG.getNumero()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Libell� : " + pCmptG.getLibelle()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "Position dans le bilan : " + pCmptG.getPosition()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("\t" + "subdivisible : " + pCmptG.isSub()));
			menu.append(String.format(System.lineSeparator()));
			menu.append(String.format("Confirmer (O/N) :"));
			return menu.toString();
			
		}
		public static char[] choix(CompteParticulier cptPart) {
			// TODO Auto-generated method stub
			return null;
		}
}


