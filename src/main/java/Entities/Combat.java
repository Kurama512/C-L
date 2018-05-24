package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Combat {
	private List<Monstre> lstMonster;
	private Joueur joueur;
	private Monstre monstre;

	public Combat(Joueur joueur) {
		this.joueur = joueur;
		this.lstMonster= new ArrayList<Monstre>();
		initialiserBestiaire();
		choixMonstre();
		
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	

	public Monstre getMonstre() {
		return monstre;
	}

	public void setMonstre(Monstre monstre) {
		this.monstre = monstre;
	}

	public void initialiserBestiaire() {
		Monstre monstre1 = new Monstre("Lutin", new Integer(10), new Integer(100), new Integer(10), new Integer(1),
				new Integer(6), new Integer(5));
		Monstre monstre2 = new Monstre("Orc", new Integer(150), new Integer(100), new Integer(10), new Integer(1),
				new Integer(6), new Integer(5));
		Monstre monstre3 = new Monstre("Dragon Rouge", new Integer(1500), new Integer(1000), new Integer(100),
				new Integer(10), new Integer(60), new Integer(50));

		lstMonster.add(monstre1);
		lstMonster.add(monstre2);
		lstMonster.add(monstre3);

	}
	
	public void choixMonstre(){
		Random random=new Random();
		int index = random.nextInt(2);
		setMonstre(lstMonster.get(index));
		
	}

	public void combattre() {
		System.out.println("un "+monstre.getNom()+" apparaît!");
		do {
		if(this.first()) {
			//this.joueur.action();
			System.out.println("action joueur");
			this.monstre.setPv(0);
		}else {
			//this.monstre.action();
			System.out.println("action monstre");
			//this.joueur.action();
			System.out.println("action joueur");
			this.monstre.setPv(0);
		}
		
		}
		while(this.joueur.getPv()>0 && this.monstre.getPv()>0);
	}
	
	public boolean first() {
		Integer first=this.joueur.getInitiative()-this.monstre.getInitiative()+50;
		Random random=new Random();
		if(random.nextInt(100)<first) {
			return true;
		}
		return false;
	}
	
}
