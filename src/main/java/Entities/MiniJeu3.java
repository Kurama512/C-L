package Entities;

import java.util.Scanner;

public class MiniJeu3 {
	Integer min;
	Integer max;
	Integer essaie;
	Integer justePrix;

	public MiniJeu3() {
		this.min = 0;
		this.max = 100;
		this.essaie = 8;
		this.justePrix = new Integer((int) (Math.random() * (max + 1 - min) + max));
	}

	public boolean lancer() {
		Boolean find = false;
		Integer choix;
		while (!find && essaie > 0) {
			choix = choixJoueur();

			if (choix.equals(justePrix)) {
				find = true;
			}

			if (choix > justePrix) {
				System.out.println("Plus petit");

			}

			if (choix < justePrix) {
				System.out.println("Plus grand");
			}

			essaie--;

		}
		if(find){
			System.out.println("Vous avez gagné");
		}
		else{
			System.out.println("Vous avez perdu");
		}
		return find;

	}

	public Integer choixJoueur() {
		System.out.println("Choissisez un nombre entre " + min + " et " + max);
		Scanner choixClavier = new Scanner(System.in);
		Integer choix = new Integer(choixClavier.nextInt());
		if (choix < min && choix > max) {
			System.out.println("Votre nombre " + choix + " n'est pas dans l'interval requis");
			return choixJoueur();
		}
		return choix;
	}

}
