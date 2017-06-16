package be.steformations.vue;

import java.util.Scanner;

import be.steformations.model.Compte;
import be.steformations.model.CompteGeneral;
import be.steformations.model.ListeComptesGenereau;

public class VueCompte {	
		public final int ETAT_COMPTE = 1;
		private static StringBuilder MenuPrincipal;
		private static StringBuilder AffichageChoix;
		private int etat;
		public static String getScreen() {
			
			MenuPrincipal = new StringBuilder();
			MenuPrincipal.append(String.format("Menu compte"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("_______________     "));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format(" .compte général"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("	1.créer"));
			MenuPrincipal.append(String.format(System.lineSeparator()));;
			MenuPrincipal.append(String.format("	2.Modifier"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("	3.Supprimer"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("	4.Lister"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format(" .compte particulier"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("	5.créer"));
			MenuPrincipal.append(String.format(System.lineSeparator()));;
			MenuPrincipal.append(String.format("	6.Modifier"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("	7.Supprimer"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("	8.Lister"));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format(System.lineSeparator()));
			MenuPrincipal.append(String.format("Entrez votre choix: "));
			return MenuPrincipal.toString();
			
		}
		
		public static String choix (){
	
			AffichageChoix.append(String.format("Vos choix :"));
			AffichageChoix.append(String.format("Création d'un compte général."));
			AffichageChoix.append(String.format("\t" + "Numero : " + CompteGeneral.numero));
			AffichageChoix.append(String.format("\t" + "Libellé : " + CompteGeneral.libelle));
			AffichageChoix.append(String.format("\t" + "Position dans le bilan : " + CompteGeneral.position));
			AffichageChoix.append(String.format("\t" + "subdivisible : " + CompteGeneral.sub));
			AffichageChoix.append(String.format("Confirmer (O/N) :"));
			return AffichageChoix.toString();
			
		}
}


