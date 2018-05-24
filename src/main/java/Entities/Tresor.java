package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tresor {
	List<Buff> lstBuff;
	List<Equipement> lstEquipement;
	List<Integer> lstArgent;
	Integer maxArgent;
	Integer maxBonus;


	public Tresor() {
		lstBuff = new ArrayList();
		lstEquipement = new ArrayList();
		lstArgent = new ArrayList();
		maxArgent = 1000;
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

	public void initializeArgent(Integer nbCoffreArgent) {
		Random ran = new Random();
		for (int i = 0; i < nbCoffreArgent; i++) {
			lstArgent.add(ran.nextInt(maxArgent));

		}

	}

	public void ouvrirCoffre(Joueur joueur) {
		Random ran = new Random();
		initializeArgent(100);
		Integer choix = 3;
		switch (choix) {
		case 3:
			Integer argent = lstArgent.get(ran.nextInt(lstArgent.size()));
			joueur.setScore(argent + joueur.getScore());
			break;
		}

	}

	private void initializeEquipement() {
		// TODO Auto-generated method stub

	}

	private void initializeBuff() {
		// TODO Auto-generated method stub

	}

}
