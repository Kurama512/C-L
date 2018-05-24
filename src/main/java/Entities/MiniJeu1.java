package Entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniJeu1 {
	
		
		public static void main (String arg[]) {
			
			int tour = 0;
			int dep,j,i;
			int posMecBouree;
			int reste;
			int[][] tab = new int[7][3];
			
			System.out.println("marche bour�e, vous devez l'aider � sortir du cachot, bonne chance !");
			
			i = 0; j = 1;
			do
			{			
			System.out.println("Entrez 0 pour aller vers le haut, on va y arriver");
			Scanner sc = new Scanner(System.in);
			try {
			dep = sc.nextInt();
			}catch (InputMismatchException e) {
				
			}
			dep = (int) (Math.random() * 3 );
			reste = tab.length - i;
			
			if (dep == 0){
				posMecBouree=tab[i++][j];
				reste = tab.length - i;
				System.out.println("Oui ! il a �t� vers l'avant, plus que "+reste+" pas avant la sortie !");
			}
			else if (dep == 1){
				posMecBouree=tab[i++][j--];
				reste = tab.length - i;
				System.out.println("Il a �t� vers l'avant mais � gauche, plus que "+reste+" pas avant la sortie !");
			}
			else if (dep == 2){
				posMecBouree=tab[i++][j++];
				reste = tab.length - i;
				System.out.println("Il a �t� vers l'avant mais � droite, plus que "+reste+" pas avant la sortie !");
			}
			tour++;
			}while (i<7 && j<3 && j>=0);
			
			if (i==7) {
				System.out.println("Vous avez atteint la sortie en "+tour+" tours!");
			}
			else if( j>2){
				System.out.println("Vous etes tomb� sur la droite en "+tour+" tours!");
			}
			else if( j<=0){
				System.out.println("Vous etes tomb� sur la gauche en "+tour+" tours!");
			}
		}

	}
