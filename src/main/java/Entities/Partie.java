package Entities;

import java.util.Scanner;

public class Partie {
	
	

	public void lanceIntro() {
		System.out.println("Bienvenue dans le monde de 'Cachots et Lézards' !\nVous allez pénétrer dans un labyrinthe d'effroi et de folie, peuplé de monstres plus terrifiants\nles uns que les autres.\nVotre but ? La fortune... car ce lieu recelle des richesses fabuleuses, sans compter les nombreux \néquipements laissés par les malheureux aventuriers qui vous ont précédé.\nVous pourrez fuir à tout moment en emportant votre butin, mais sachez que si vous décidez de\ncontinuer, c'est peut-être la mort qui vous attend derrière la prochaine porte...\n\nPuissiez-vous ne pas périr dans les geôles de 'Cachots & Lézards' !");
	}

	public void creeChoixPortes(Joueur joueur) {
		Scanner x = new Scanner(System.in);
		Integer cj=0;
		Integer portes = (int) ((Math.random()*3)+2);
		do {
			try {
				System.out.println("Vous etes face a " + portes + " portes. Laquelle voulez-vous emprunter ?");
				cj = x.nextInt();
			} catch (Exception e) {
				System.out.println("Je n'ai pas compris, recommencez...");
				x = new Scanner(System.in);
				cj = x.nextInt();
			} 
		} while (cj<1 || cj>portes);
		Integer de = (int) ((Math.random()*7)+1);
		System.out.println(de);
		switch(de) {
		case 1: PieceVide pv=new PieceVide(); pv.generatePieceVide(joueur);break;
		case 2: Tresor tresor=new Tresor(); tresor.ouvrirCoffre(joueur);break;
		case 3: Combat combat=new Combat(joueur); combat.combattre();break; 
		case 4: MiniJeu mj = new MiniJeu(); Boolean win = mj.lauchMiniJeu(); if(!win){Combat combat2=new Combat(joueur); combat2.combattre();}else{Tresor tresor2=new Tresor(); tresor2.ouvrirCoffre(joueur);} break; 
		case 5: Combat combat2=new Combat(joueur); combat2.combattre();break; 
		case 6: MiniJeu mj2 = new MiniJeu(); Boolean win2 = mj2.lauchMiniJeu(); if(!win2){Combat combat4=new Combat(joueur); combat4.combattre();}else{Tresor tresor2=new Tresor(); tresor2.ouvrirCoffre(joueur);} break;
		case 7: Combat combat3=new Combat(joueur); combat3.combattre();break;
		}
	}

	public void finPartie() {
		System.out.println("La partie est terminee");	
	}
}