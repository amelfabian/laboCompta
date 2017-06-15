package testModel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.steformations.model.*;

public class TestCompteGeneral {
	private CompteGeneralNonSubdivisable cptgen = new CompteGeneralNonSubdivisable(); 


	@Test
	public void testNumIsValid(){
		String string = "1234";
		assertTrue(cptgen.numIsValid(string));
	}
	
	@Test
	public void testPositionIsvalid(){
		assertTrue(cptgen.positionIsValid('a'));
	}


}
