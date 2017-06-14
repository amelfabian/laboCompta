package be.steformations.vue;

public class VueCompte {	
		public final int ETAT_COMPTE = 1;
		private int etat;
		
		public static String getScreen() {
			StringBuilder compteBuild;
			compteBuild = new StringBuilder();
			compteBuild.append(String.format("Menu logiciel"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("-------------------"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("compte général"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("c.créer"));
			compteBuild.append(String.format(System.lineSeparator()));;
			compteBuild.append(String.format("m.Modifier"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("s.Supprimer"));
			compteBuild.append(String.format(System.lineSeparator()));
			compteBuild.append(String.format("l.Lister"));
			compteBuild.append(String.format(System.lineSeparator()));
			return compteBuild.toString();
			
		}


}
