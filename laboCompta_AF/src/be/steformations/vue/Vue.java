package be.steformations.vue;

import be.steformations.modele.CompteGeneral;
import be.steformations.modele.CompteParticulier;

public class Vue {
	private StringBuilder menu;

	public String getScreenMenu() {
		menu = new StringBuilder();
		menu.append(String.format("Menu"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("-----"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(1) Compte général"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(2) Compte particulier"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(3) Ecriture"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Entrez votre choix: "));
		return menu.toString();

	}
	

	public String getScreenGeneral() {
		menu = new StringBuilder();
		menu.append(String.format("Menu compte général"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("--------------------"));

		menu.append(String.format(System.lineSeparator()));

		menu.append(String.format("(1) Créer"));
		menu.append(String.format(System.lineSeparator()));
		;
		menu.append(String.format("(2) Modifier"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(3) Supprimer"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(4) Lister"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Entrez votre choix: "));
		return menu.toString();
	}

	public String getScreenParticulier() {
		menu = new StringBuilder();
		menu.append(String.format("Menu compte particulier"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("--------------------"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(1) Créer"));
		menu.append(String.format(System.lineSeparator()));
		;
		menu.append(String.format("(2) Modifier"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(3) Supprimer"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("(4) Lister"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Entrez votre choix: "));
		return menu.toString();
	}

	public String AfficheCompteAvantConfirmerCg(CompteGeneral pCmptG) {
		menu = new StringBuilder();
		menu.append(String.format("Vos choix :"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Création d'un compte général."));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "Numero : " + pCmptG.getNumero()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "Libellé : " + pCmptG.getLibelle()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "Position dans le bilan : " + pCmptG.getPosition()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "subdivisible : " + pCmptG.isSub()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Confirmer (O/N) :"));
		return menu.toString();
	}

	public String AfficheCompteAvantConfirmerCp(CompteParticulier CmptP) {
		menu = new StringBuilder();
		menu.append(String.format("Vos choix :"));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Création d'un compte Particulier."));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "Compte choisi : " + CmptP.getComptGenSub()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "numero : " + CmptP.getNumero()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "libelle : " + CmptP.getLibelle()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("\t" + "subdivisible : " + CmptP.isSub()));
		menu.append(String.format(System.lineSeparator()));
		menu.append(String.format("Confirmer (O/N) :"));
		return menu.toString();
	}

	public void getScreenEcriture() {
		System.out.println("Vue.getScreenEcriture()");

	}

}
