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
			actionJoueur();
			this.monstre.setPv(0);
			if(monstre.getPv() > 0)
			{
				actionMonstre();				
			}
		}else {
			actionMonstre();
			this.joueur.setPv(0);
			if(joueur.getPv() > 0)
			{
				actionJoueur();				
			}
		}
		
		}
		while(this.joueur.getPv()>0 && this.monstre.getPv()>0);
		
		if(joueur.getPv() <= 0)
		{
			System.out.println("Le heros est tombé.");
		}
		else
		{
			System.out.println("Combat remporté: lancer recompense");
		}
	}
	
	public void actionJoueur()
	{
		Integer choix = choixActionJoueur();
		
		switch (choix) {
		case 1:	System.out.println("Le heros inflige des degats si le monstre n'esquive pas");break;
		case 2:	System.out.println("Le heros se defend");break;
		default: 
			System.out.println("le heros ne sait pas quoi faire");
			actionJoueur();		
		;break;
		}
	}

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
	
	public void actionMonstre()
	{
		Random rand = new Random();
		Integer choix = rand.nextInt(2);
		
		switch (choix) {
		case 0:	System.out.println("le monstre inflige des degats si le heros n'esquive pas");break;
		case 1:	System.out.println("le monstre se defend");break;
		default: 
			System.out.println("Erreur de random sur le monstre");
			;break;
		}
	}
	
	public boolean first() {
		Integer first=this.joueur.getInitiative()-this.monstre.getInitiative()+50;
		Random random=new Random();
		if(random.nextInt(101)<first) {
			return true;
		}
		return false;
	}
	
}
