package be.steformations.vue;

public class VueCompte {	
		public final int ETAT_COMPTE = 1;
		private int etat;
		
		public static String getScreen() {
			StringBuilder compteBuild;
			compteBuild = new StringBuilder();
			compteBuild.append(String.format("Menu compte"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("_______________     "));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format(" .compte général"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("	1.créer"));
			compteBuild.append(String.format(System.lineSeparator()));;
			compteBuild.append(String.format("	2.Modifier"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("	3.Supprimer"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("	4.Lister"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format(" .compte particulier"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("	5.créer"));
			compteBuild.append(String.format(System.lineSeparator()));;
			compteBuild.append(String.format("	6.Modifier"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("	7.Supprimer"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("	8.Lister"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("Entrez votre choix: "));
			return compteBuild.toString();
			
		}


}
