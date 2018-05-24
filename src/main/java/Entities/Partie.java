package Entities;

import java.util.Scanner;

public class Partie {
	
	Scanner x = new Scanner(System.in);

	public void lanceIntro() {
		System.out.println("Ceci est l'intro... \nBienvenue dans 'Cachots & Lézards' \nVotre but est d'aller le plus loin possible pour amasser des points et exploser le score.");
	}

	public void creeChoixPortes() {
		Integer portes = 3;	
		System.out.println("Vous êtes face à "+portes+" portes. Laquelle voulez-vous emprunter ?");	
		Integer cj = x.nextInt();
		Integer de = (int) ((Math.random()*5)+1);
		switch(de) {
		case 1: System.out.println("une piece vide");break;
		case 2: System.out.println("un tresor");break;
		case 3: System.out.println("un monstre");break;
		case 4: System.out.println("un mini jeu");break;
		case 5: System.out.println("un monstre");break;
		}
	}

	public void finPartie() {
		System.out.println("La partie est terminée");	
	}

}
