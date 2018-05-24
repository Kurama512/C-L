package Entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MiniJeu3Test {
	MiniJeu3 game3;

	@Before
	public void before() {
		game3 = new MiniJeu3();
	}

	@Test
	public void testerPartiePerdue() {
		game3.justePrix = 40;
		assertEquals(game3.lancer(), false);
	}
	
	@Test
	public void testerPartieGagne() {
		game3.justePrix = 40;
		assertEquals(game3.lancer(), true);
	}
	
	@Test
	public void choixJoueursCorrect() {
		game3.choixJoueur();
	}
	
	@Test
	public void choixJoueursInCorrect() {
		game3.choixJoueur();
	}
	
}
