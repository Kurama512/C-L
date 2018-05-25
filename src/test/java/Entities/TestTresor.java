package Entities;

import org.junit.Before;
import org.junit.Test;

public class TestTresor {
	Tresor tresor;

	@Before
	public void before() {
		Joueur joueur = new Joueur();
		tresor = new Tresor();

	}

	@Test
	public void testAjouterTresor() {
		tresor.initializeArgent(10);
	}

	@Test
	public void testAjouterTresorJoueur() {
		Joueur joueur = new Joueur();
		tresor.ouvrirCoffre(joueur);
		System.out.println(joueur.getScore());
	}

}
