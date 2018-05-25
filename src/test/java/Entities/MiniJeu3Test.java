package Entities;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MiniJeu3Test {
	MiniJeu3 game3;

	@Before
	public void before() {
		game3 = new MiniJeu3();

	}

	@Test
	public void testerPartiePerdue() {
		assertEquals(game3.lancer(), false);
	}

	@Test
	public void testerPartieGagne() {
		assertEquals(game3.lancer(), true);
	}

	@Test
	public void choixJoueursCorrect() {
		assertEquals(game3.choixCorrecte(40), true);

	}

	@Test
	public void choixJoueursInCorrect() {
		assertEquals(game3.choixCorrecte(555), false);
		assertEquals(game3.choixCorrecte(-10), false);
	}
}
