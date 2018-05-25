package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Combat {
	Scanner scan = new Scanner(System.in);
	
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
		Monstre monstre1 = new Monstre("Lutin mourant",10, 100, 10, 1, 6, 5);
		Monstre monstre2 = new Monstre("Orc", 150, 150, 10, 1,6,5);
		Monstre monstre3 = new Monstre("Dragon Rouge", 1500, 1500, 100, 10, 60, 50);

		lstMonster.add(monstre1);
		lstMonster.add(monstre2);
		lstMonster.add(monstre3);

	}
	
	public void choixMonstre(){
		Random random=new Random();
		int index = random.nextInt(3);
		setMonstre(lstMonster.get(index));
		
	}

	//
	public Boolean combattre() {
		System.out.println("un "+monstre.getNom()+" apparaît!");
		do {
		if(this.first()) {
			actionJoueur();
			if(monstre.getPv() > 0)
			{
				actionMonstre();				
			}
		}else {
			actionMonstre();
			if(joueur.getPv() > 0)
			{
				actionJoueur();				
			}
		}
		System.out.println("PV monstre: " + monstre.getPv());
		System.out.println("PV joueur: " + joueur.getPv());
		System.out.println("-----------------------------------------------------------------------------");
		}
		while(this.joueur.getPv()>0 && this.monstre.getPv()>0);
		
		if(joueur.getPv() <= 0)
		{
			System.out.println("Le heros est tombé.");
			return false;
		}
		else
		{
			System.out.println("Combat remporté:");
			return true;
		}
	}
	
	//CHOIX DU JOUEUR LORS DU COMBAT
	private Integer choixActionJoueur() {
		Scanner scan = new Scanner(System.in);
		Integer choix;		
		try {
			do {			
				System.out.println("Choisissez une action: ");
				System.out.println("1 - Attaquer ");
				System.out.println("2 - Se defendre ");
				choix = scan.nextInt();
			} while (choix<=0||choix>2);			
		} 
		catch (Exception e) 
		{
			choix = 0;
		}
		return choix;
	}
	
	//LISTE DES DIFFERENTES ACTIONS DU JOUEUR EN FONCTION LIEE A CHOIX ACTION JOUEUR()
	public void actionJoueur()
	{
		Integer choix = choixActionJoueur();
		
		switch (choix) {
		case 1:
			if(!testEsquiveMonstre())
			{
				int degats = calculDegats(joueur);
				System.out.println("le Heros inflige " + degats + " degats !");
				monstre.setPv(monstre.getPv() - degats);
			}else
			{
				System.out.println("Le monstre esquive !");
			}
			break;
		case 2:	
			System.out.println("Le heros se defend");
			break;
		default: 
			System.out.println("Le heros ne sait pas quoi faire");
			actionJoueur();		
		;break;
		}
	}

	//CHOIX RANDOM PARMIS LES ATTAQUES DU MONSTRE
	public void actionMonstre()
	{
		Random rand = new Random();
		Integer choix = rand.nextInt(2);
		
		switch (choix) {
		case 0:	
			System.out.println("Le monstre attaque !");
			if(!testEsquiveJoueur())
			{
				int degats = calculDegats(monstre);
				System.out.println("le monstre inflige " + degats + " degats !");
				joueur.setPv(joueur.getPv() - degats);
			}else
			{
				System.out.println("Le heros esquive !!!");
			}
			break;
		case 1:	
			System.out.println("le monstre se defend");
			break;
		default: 
			System.out.println("Erreur de random sur le monstre");
			;break;
		}
	}
	
	//CALCUL DES DEGATS DE L'ATTAQUANT
	public int calculDegats(Object attaquant)
	{
		Random rand = new Random();
		Integer degats = 0;
		if(attaquant.equals(joueur))//SI L'ATTAQUANT EST LE JOUEUR
		{
			degats = joueur.getAttaque() - monstre.getDefense() + rand.nextInt(11);
			if(degats <0)
			{
				degats = 0;
			}
			return degats;
		}else if(attaquant.equals(monstre))//SI L'ATTAQUANT EST LE MONSTRE
		{			
			degats = monstre.getAttaque() - joueur.getDefense() + rand.nextInt(11);
			if(degats <0)
			{
				degats = 0;
			}
			return degats;
		}else
		{
			System.out.println("ATTENTION CALCUL DEGATS NE DOIT PRENDRE EN COMPTE QU'UN JOUEUR OU UN MONSTRE");
			return 0;
		}
			
	}
	
	//VERIFICATION SI LE JOUEUR OU LE MONSTRE ESQUIVE
	public boolean testEsquiveJoueur()
	{
		Random rand = new Random();
		if(rand.nextInt(101)<=joueur.getEsquive())
		{
			return true;
		}
		return false;
	}
	public boolean testEsquiveMonstre()
	{
		Random rand = new Random();
		if(rand.nextInt(101)<=monstre.getEsquive())
		{
			return true;
		}
		return false;
	}
	
	//FONCTION PRENANT EN COMPTE L'INITIATIVE POUR SAVOIR QUI ATTAQUE EN PREMIER A CHAQUE TOUR
	public boolean first() {
		Integer first=this.joueur.getInitiative()-this.monstre.getInitiative()+50;
		Random random=new Random();
		if(random.nextInt(101)<first) {
			return true;
		}
		return false;
	}
	
}
