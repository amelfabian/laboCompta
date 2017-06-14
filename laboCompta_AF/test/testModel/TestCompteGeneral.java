package testModel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.steformations.model.*;

public class TestCompteGeneral {
	private CompteGeneral cptgen = new CompteGeneral(); 

	@Test
	public void isSubdivisable() {
		cptgen.setValid(true);
		assertTrue(cptgen.isValid());
	}
	


}
