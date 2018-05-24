package Entities;

import java.util.Scanner;

public class Joueur {
	Scanner x = new Scanner(System.in);
	
	private Integer score;
	private Integer pv = 150;

	public Integer getPv() {
		return pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer menu1() {
		Integer choix=0;
		
		try {
			do {
			System.out.println("MENU 1\n 1-AVANCER, 2-EQUIPEMENT, 3-STATISTIQUES, 4-FUIR");
			choix = x.nextInt();
			}
			while(choix<1||choix>4);
		} catch (Exception e) {
			choix = 4;
		}
		return choix;
	}

	public void afficherEquipement() {
		//test
		System.out.println("Voici votre equipement");
	}

	public void afficherStats() {
		System.out.println("Voici vos statistiques");	
	}

}
