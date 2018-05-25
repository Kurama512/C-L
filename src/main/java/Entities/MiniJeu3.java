package Entities;

import java.util.Random;
import java.util.Scanner;

public class MiniJeu3 {
	private Integer min;
	private Integer max;
	private Integer essai;
	private Integer justePrix;
	private Integer choix;
	private Boolean find;
	private Random ran;

	public MiniJeu3() {
		this.min = 0;
		this.max = 100;
		this.essai = 8;
		find = false;
		ran = new Random();
		this.justePrix = ran.nextInt(max);
	}

	public boolean lancer() {
		while (!find && essai > 0) {
			choix = choixJoueur();

			if (choix.equals(justePrix)) {
				return true;
			}

			if (choix > justePrix) {
				System.out.println("Ce que vous recherchez est bien plus petit");
			}

			if (choix < justePrix) {
				System.out.println("Votre ambition est trop petite, revoyez la a la hausse");
			}
			essai--;
			System.out.println("Il vous reste "+ essai + " essai(s)");

		}
		if (find) {
			System.out.println("Victoire !!!!!!!!!!!!!!!!!");
		} else {
			System.out.println("La bonne combinaison etait : "+justePrix);
			System.out.println("Un monstre veut vous ajouter à son menu, bonne chance");
		}
		return false;

	}

	public Integer choixJoueur() {
		System.out.println("Choisissez un nombre entre " + min + " et " + max);
		Scanner choixClavier = new Scanner(System.in);
		try {
			choix = choixClavier.nextInt();
		} catch (Exception e) {
			System.out.println("c'est un chiffre qui est attendu");
			return choixJoueur();
		}
		
		if (!choixCorrecte(choix)) {
			System.out.println("Votre nombre " + choix + " n'est pas dans l'interval requis");
			return choixJoueur();
		}
		return choix;
	}

	public Boolean choixCorrecte(Integer choix) {
		if (choix < this.getMin() || choix > this.getMax())
			return false;
		return true;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getEssai() {
		return essai;
	}

	public void setEssai(Integer essai) {
		this.essai = essai;
	}

	public Integer getJustePrix() {
		return justePrix;
	}

	public void setJustePrix(Integer justePrix) {
		this.justePrix = justePrix;
	}

	public Integer getChoix() {
		return choix;
	}

	public void setChoix(Integer choix) {
		this.choix = choix;
	}

	public Boolean getFind() {
		return find;
	}

	public void setFind(Boolean find) {
		this.find = find;
	}

}
