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
				try {
					System.out.println("Je n'ai pas compris, recommencez...");
					x = new Scanner(System.in);
					cj = x.nextInt();
				} catch (Exception e1) {
					try {
						System.out.println("Je n'ai pas compris, recommencez...");
						x = new Scanner(System.in);
						cj = x.nextInt();
					} catch (Exception e2) {
						System.out.println("Manifestement, vous tapez n'importe quoi, au revoir...");
						this.finPartie();
					}
				}
			} 
		} while (cj<1 || cj>portes);
		Integer de = (int) ((Math.random()*7)+1);
		System.out.println(de);
		switch(de) {
		case 1: this.lancePieceVide(joueur);break;
		case 2: this.lanceTresor(joueur);break;
		case 3: this.lanceCombat(joueur);break; 
		case 4: this.lanceMiniJeu(joueur);break; 
		case 5: this.lanceCombat(joueur);break;
		case 6: this.lanceMiniJeu(joueur);break; 
		case 7: this.lanceCombat(joueur);break;
		default: this.lanceCombat(joueur);break;
		}
	}
	
	public void lancePieceVide(Joueur joueur){
		PieceVide pv=new PieceVide(); 
		pv.generatePieceVide(joueur);
	}
	
	public void lanceTresor(Joueur joueur){
		Tresor tresor=new Tresor(); 
		tresor.ouvrirCoffre(joueur);
	}
	
	public void lanceMiniJeu(Joueur joueur){
		MiniJeu mj = new MiniJeu();
		Boolean win = mj.lauchMiniJeu();
		if(!win){
			Combat combat=new Combat(joueur);
			combat.combattre();
			}else{
				Tresor tresor=new Tresor();
				tresor.ouvrirTypeCoffre(2,joueur);}
	}
	
	public void lanceCombat(Joueur joueur){
		Combat combat=new Combat(joueur);
		Boolean win = combat.combattre();
		if(win){
			Tresor tresor=new Tresor();
			tresor.ouvrirTypeCoffre(2,joueur);
			}
	}

	public void finPartie() {
		System.out.println("La partie est terminee");
		System.out.println("--->TO DO : lancement de l'affichage du classement des meilleurs et arret du jeu.");
	}
}