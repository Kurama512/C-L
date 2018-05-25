package main;

import Entities.Joueur;
import Entities.Partie;

public class Main {

	public static void main(String[] args) {
		
		//-----------DEBUT DU JEU-----------------------------
		
		Partie partie = new Partie();
		boolean gameOver = false;
		Joueur joueur = new Joueur();
		partie.lanceIntro();
		
	
		//-----------BOUCLE DE JEU-----------------------------
		
		do {
			//-----------MENU JOUEUR------------------------------
			Integer choix = joueur.menu1();
			switch (choix) {
			case 1:
				partie.creeChoixPortes(joueur);
				break;
			case 2:
				joueur.afficherEquipement();
				break;
			case 3:
				joueur.afficherStats();
				break;
			case 4:
				gameOver = true;
				break;
			}
			
			//------------FIN DU JEU ?------------------------------
			Integer pv = joueur.getPv();
			if (pv <= 0 || gameOver) {
				partie.finPartie();
				gameOver = true;
			} else
				gameOver = false;
		} while (!gameOver);
	}
}