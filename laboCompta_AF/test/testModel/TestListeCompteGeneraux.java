package testModel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.steformations.modele.CompteGeneral;
import be.steformations.modele.ListeComptesGeneraux;

public class TestListeCompteGeneraux {
	ListeComptesGeneraux LCG = new ListeComptesGeneraux();;
	CompteGeneral cptGen = new CompteGeneral("12000","toto",'a');
	CompteGeneral cptGen2 = new CompteGeneral("1200","toto",'a');
	@Before 
	public void init() {
		
		LCG.addToList(cptGen);
		LCG.addToList(cptGen2);
		LCG.addToList(cptGen);
	}
	@Test 
	public void testSize(){

		assertEquals(LCG.size(),2);
		
	}
	
	@Test
	public void TestAddList(){
		assertTrue(LCG.addToList(cptGen2));
	}
}
