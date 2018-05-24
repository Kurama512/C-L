package Entities;

import java.util.Scanner;

public class Joueur {
	Scanner x = new Scanner(System.in);
	
	private String nom;
	private Integer score;
	private Integer pv = 150;
	private Integer pvMax = 150;
	private Integer esquive = 150;
	private Integer initiative = 150;
	private Integer defense = 150;
	private Integer attaque = 150;
	private Armure armure;
	private MainDroite mainDroite;
	private MainGauche mainGauche;
//	private List<Buff> listBuff;
	
	
	//CONSTRUCTEUR
	public Joueur() 
	{		
		this.armure = new Armure("Pagne standart", 0, 0, 0, 1);
		this.mainDroite = new MainDroite("Poing nue",0,0,0,0);
		this.mainGauche = new MainGauche("Poing nue",0,0,0,0);		
	}
	
	

	//GET SET
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getPvMax() {
		return pvMax;
	}

	public void setPvMax(Integer pvMax) {
		this.pvMax = pvMax;
	}

	public Integer getEsquive() {
		return esquive;
	}

	public void setEsquive(Integer esquive) {
		this.esquive = esquive;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getAttaque() {
		return attaque;
	}

	public void setAttaque(Integer attaque) {
		this.attaque = attaque;
	}

	public Armure getArmure() {
		return armure;
	}

	public void setArmure(Armure armure) {
		this.armure = armure;
	}

	public MainDroite getMainDroite() {
		return mainDroite;
	}

	public void setMainDroite(MainDroite mainDroite) {
		this.mainDroite = mainDroite;
	}

	public MainGauche getMainGauche() {
		return mainGauche;
	}

	public void setMainGauche(MainGauche mainGauche) {
		this.mainGauche = mainGauche;
	}


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

	
	//METHODES
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
