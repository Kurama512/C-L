package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tresor {
	List<Buff> lstBuff;
	List<Equipement> lstEquipement;
	List<Integer> lstArgent;
	Random ran;
	Integer maxArgent;
	Integer maxBonus;

	public Tresor() {
		lstBuff = new ArrayList<Buff>();
		lstEquipement = new ArrayList<Equipement>();
		lstArgent = new ArrayList<Integer>();
		maxArgent = 200;

		this.ran = new Random();
	}

	public void ajouterCoffreArgent(Integer argent) {
		lstArgent.add(argent);
	}

	public void ajouterCoffreEquipement(Equipement equipement) {
		lstEquipement.add(equipement);
	}

	public void ajouterCoffreBuff(Buff buff) {
		lstBuff.add(buff);
	}

	public void ouvrirCoffre(Joueur joueur) {
		Integer choix = ran.nextInt(3) + 1;
		ouvrirTypeCoffre(choix, joueur);

	}

	public void ouvrirTypeCoffre(Integer choix, Joueur joueur) {
		switch (choix) {
		case 1:
			initializeBuff();
			Buff buff = lstBuff.get(ran.nextInt(lstBuff.size()));
			System.out.println("Vos caracteristiques avant le buff");
			joueur.afficherStats();
			joueur.addBuff(buff);
			System.out.println("Vos caracteristiques apres le buff");
			joueur.afficherStats();
			break;

		case 2:
			initializeArgent(100);
			Integer argent = lstArgent.get(ran.nextInt(lstArgent.size()));
			joueur.setScore(argent + joueur.getScore());
			System.out.println("Vous avez acquis " + argent + " piéces d'or");
		case 3:
			initializeEquipement();
			Equipement equipement = lstEquipement.get(ran.nextInt(lstEquipement.size()));
			choisirEquipement(joueur, equipement);
			break;

		default:
			ouvrirCoffre(joueur);
			break;

		}
	}

	public void choisirEquipement(Joueur joueur, Equipement equipement) {
		joueur.afficherEquipement();
		System.out.println("Vous avez trouve l'equipement suivant : ");
		System.out.println(equipement.toString());
		if (changerEquipementJoueur()) {
			modifierEquipementJoueur(joueur, equipement);
		}

	}

	public void modifierEquipementJoueur(Joueur joueur, Equipement equipement) {
		if (equipement.getClass().getName().equals(MainDroite.class.getName())) {
			joueur.setMainDroite((MainDroite) equipement);
			joueur.getMainDroite().setType("Main droite");

		} else if (equipement.getClass().getName().equals(MainGauche.class.getName())) {
			joueur.setMainGauche((MainGauche) equipement);
			joueur.getMainGauche().setType("Main Gauche");
		} else if (equipement.getClass().getName().equals(Armure.class.getName())) {
			joueur.setArmure((Armure) equipement);
			joueur.getArmure().setType("Armure");
		}

	}

	public boolean changerEquipementJoueur() {
		System.out.println("Voulez vous changer d'equipement ?");
		System.out.println("Taper 1 pour Oui");
		System.out.println("Taper 2 pour Non");
		Scanner choixClavier = new Scanner(System.in);
		Integer choix;
		try {
			choix = new Integer(choixClavier.nextInt());
		} catch (Exception e) {
			System.out.println("c'est un chiffre qui est attendu");
			return changerEquipementJoueur();
		}
		if (choix.equals(1)) {
			return true;
		}

		if (choix.equals(2)) {
			return false;
		}
		System.out.println("Vous avez choisis bien mal, 1 ou 2 pas " + choix);
		return changerEquipementJoueur();
	}

	private void initializeEquipement() {
		ajouterCoffreEquipement(new MainGauche("Epee main gauche", 2, 0, 0, 0));
		ajouterCoffreEquipement(new MainGauche("Gros bouclier", 0, 100, 0, 0));
		ajouterCoffreEquipement(new MainGauche("sabre dit le champ pagne", 5, 4, 2, 0));
		ajouterCoffreEquipement(new Armure("Armure De bronze", 0, 5, 0, 0));
		ajouterCoffreEquipement(new MainDroite("Epee brillante", 5, 0, 0, 10));
		ajouterCoffreEquipement(new MainDroite("Arc elfique enchantée", 6, 0, 0, 0));
		ajouterCoffreEquipement(new MainDroite("rune staff of curse ", -10, 0, 0, 0));
		ajouterCoffreEquipement(new Armure("Armure leclerq", 100, 0, 0, 0));
	}

	private void initializeBuff() {
		ajouterCoffreBuff(new Buff("Anneau de vie", 25, 50, 0, 0, 0, 0));
		ajouterCoffreBuff(new Buff("Anneau d'attaque", 0, 0, 0, 10, 10, 10));
		ajouterCoffreBuff(new Buff("Anneau d'esquive", 0, 0, 0, 0, 10, 10));
		ajouterCoffreBuff(new Buff("Malediction du bras droit", 0, 0, -5, -5, 0, 0));
		ajouterCoffreBuff(new Buff("Malediction du type ivre", 0, 0, 10, -10, 0, 0));
	}

	public void initializeArgent(Integer nbCoffreArgent) {
		for (int i = 0; i < nbCoffreArgent; i++) {
			lstArgent.add(ran.nextInt(maxArgent));
		}
	}
}