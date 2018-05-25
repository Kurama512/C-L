package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tresor {
	List<Buff> lstBuff;
	List<Equipement> lstEquipement;
	List<Integer> lstArgent;
	Random ran ;
	Integer maxArgent;
	Integer maxBonus;


	public Tresor() {
		lstBuff = new ArrayList<Buff>();
		lstEquipement = new ArrayList<Equipement>();
		lstArgent = new ArrayList<Integer>();
		maxArgent = 1000;

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

	public void initializeArgent(Integer nbCoffreArgent) {
		for (int i = 0; i < nbCoffreArgent; i++) {
			lstArgent.add(ran.nextInt(maxArgent));

		}

	}

	public void ouvrirCoffre(Joueur joueur) {
		Integer choix = ran.nextInt(3) + 1;
		
		ouvrirTypeCoffre(choix, joueur);
		
		

	}
	public void ouvrirTypeCoffre(Integer choix, Joueur joueur){
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
			System.out.println("Vous avez acquis "+argent+" piéces d'or");
		case 3:	
			initializeEquipement();
			break;
		}
	}
	
	
	

	private void initializeEquipement() {
		// TODO Auto-generated method stub

	}

	private void initializeBuff() {
		ajouterCoffreBuff( new Buff("Anneau de vie", 25,50, 0,0,0,0));
		ajouterCoffreBuff( new Buff("Anneau d'attaque", 0,0, 0,10,10,10));
		ajouterCoffreBuff( new Buff("gain positif aléatoire", ran.nextInt(10),ran.nextInt(10), ran.nextInt(10),ran.nextInt(10),ran.nextInt(10),ran.nextInt(10)));
		ajouterCoffreBuff( new Buff("Malediction", ran.nextInt(10) * -1,ran.nextInt(10)*-1, ran.nextInt(10)*-1,ran.nextInt(10)*-1,ran.nextInt(10)*-1,ran.nextInt(10)*-1));
	
	}

}
