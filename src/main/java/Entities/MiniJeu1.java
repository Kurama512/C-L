package Entities;

import java.util.Random;
import java.util.Scanner;

public class MiniJeu1 {
	public static String[][] initialisation() {
		String[][] pont = new String[8][3];
		for (int i = 0; i < pont.length; i++) {
			for (int j = 0; j < pont[i].length; j++) {
				pont[i][j] = " ";
			}
			pont[0][1] = "X";

		}
		return pont;
	}

	public static Boolean lancer() {
		
		boolean find;
		int direction, choix, i, j;

		String[][] pont = initialisation();
		String posJoueur = "X";
		boolean surpont = true;
		int posX = 1;
		int posY = 0;

		pont[posY][posX] = posJoueur;

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		while (surpont && posY < 7) {
			try {
				System.out.println("Choisir une direction: gauche-1,tout droit-2,droite-3 , position" + posY);
				choix = s.nextInt();
				direction = r.nextInt(3) - 1;
				// on nettoie l'ancienne position
				pont[posY][posX] = " ";
				// on met en jour les coordonn�es
				posY++;
				posX = posX + direction;
				pont[posY][posX] = posJoueur;

				for (i = 0; i < pont.length; i++) {
					for (j = 0; j < pont[i].length; j++) {
						System.out.print("|");
						System.out.print(" ");
						System.out.print(pont[i][j]);
						System.out.print("|");
					}
					System.out.println();
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("tombe a l eau ");
				surpont = false;
				return false;
			}

		}

		if (surpont){
			System.out.println("vous etes pass�");
			return true;
		}
		else{
		return false;
		}
	}
}
