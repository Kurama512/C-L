package Entities;

import java.util.Scanner;

public class Partie {
	
	Scanner x = new Scanner(System.in);

	public void lanceIntro() {
		System.out.println("Ceci est l'intro... \nBienvenue dans 'Cachots & Lezards' \nVotre but est d'aller le plus loin possible pour amasser des points et exploser le score.");
	}

	public void creeChoixPortes(Joueur joueur) {
		Integer cj=0;
		Integer portes = (int) ((Math.random()*3)+1);
		do {
			try {
				System.out.println("Vous etes face a " + portes + " portes. Laquelle voulez-vous emprunter ?");
				cj = x.nextInt();
			} catch (Exception e) {
				System.out.println("Je n'ai pas compris, recommencez...");
				Scanner x = new Scanner(System.in);
				cj = x.nextInt();
			} 
		} while (cj<1 || cj>portes);
		Integer de = (int) ((Math.random()*5)+1);
		switch(de) {
		case 1: PieceVide pv=new PieceVide(); pv.generatePieceVide(joueur);break;
		case 2: Tresor tresor=new Tresor(joueur); tresor.ouvrirCoffre();break;
		case 3: Combat combat=new Combat(joueur); combat.combattre();break; 
		case 4: MiniJeu mj = new MiniJeu(); Boolean win = mj.lauchMiniJeu(); if(!win){Combat combat2=new Combat(joueur); combat2.combattre();} break; 
		case 5: Combat combat3=new Combat(joueur); combat3.combattre();break; 
		}
	}

	public void finPartie() {
		System.out.println("La partie est terminee");	
	}
}