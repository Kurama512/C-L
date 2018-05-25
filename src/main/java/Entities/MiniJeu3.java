package Entities;

import java.util.Random;
import java.util.Scanner;

public class MiniJeu3 {
	private Integer min;
	private Integer max;
	private Integer essaie;
	private Integer justePrix;
	private Integer choix;
	private Boolean find;
	private Random ran;

	public MiniJeu3() {
		this.min = 0;
		this.max = 100;
		this.essaie = 8;
		ran = new Random();
		this.justePrix = ran.nextInt(max);
		find = false;
	}

	public boolean lancer() {
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
		if (find) {
			System.out.println("Vous avez gagn�");
		} else {
			System.out.println("Vous avez perdu");
		}
		return find;

	}

	public Integer choixJoueur() {
		System.out.println("Choisissez un nombre entre " + min + " et " + max);
		Scanner choixClavier = new Scanner(System.in);
		choix = new Integer(choixClavier.nextInt());

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

	public Integer getEssaie() {
		return essaie;
	}

	public void setEssaie(Integer essaie) {
		this.essaie = essaie;
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
