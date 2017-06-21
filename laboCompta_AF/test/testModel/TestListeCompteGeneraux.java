package testModel;

import static org.junit.Assert.*;

import org.junit.Test;

import be.steformations.modele.CompteGeneral;
import be.steformations.modele.ListeComptesGeneraux;

public class TestListeCompteGeneraux {

	@Test
	public void testAddToList() {
		ListeComptesGeneraux LCG = new ListeComptesGeneraux();
		CompteGeneral cptGen = new CompteGeneral("12000","toto",'a');
		
		assertTrue(LCG.addToList(cptGen));
		
	}

}
