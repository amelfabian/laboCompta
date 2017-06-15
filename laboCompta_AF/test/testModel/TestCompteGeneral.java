package testModel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.steformations.model.*;

public class TestCompteGeneral {
	private CompteGeneralNonSubdivisable cptgen = new CompteGeneralNonSubdivisable(null); 


	@Test
	public void testNumIsValidSubdivisable(){
		String string = "1234";
		assertTrue(cptgen.Subdivisable(string));
	}
	
/*	if ( subdivisable  && 6 chiffre )
	{
		compteSubdivisable particulier
	}
	if ( moins de six chifre)
	{
		compteGeneralSubdivisable
	}
	if 6 chiffre non subdivisableµ
	*/
	@Test
	public void testPositionIsvalid(){
		assertTrue(cptgen.positionIsValid('a'));
	}


}
