package testModel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CompteGeneral;

public class TestCompteGeneral {
	private CompteGeneral cptgen = new CompteGeneral(); 

	@Test
	public void test() {
		cptgen.setValid(true);
		assertTrue(cptgen.isValid());
	}

}
