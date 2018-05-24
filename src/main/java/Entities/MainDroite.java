package Entities;

public class MainDroite extends Equipement {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MainDroite(String nom, Integer bonusAtk, Integer bonusDef, Integer bonusIni, Integer bonusEsq, String type) {
		super(nom, bonusAtk, bonusDef, bonusIni, bonusEsq);
		this.type = "Main droite";
	}

	public MainDroite() {
		super();
	}

	@Override
	public String toString() {
		return this.getNom() + " -  Attaque : "+ this.getBonusAtk()+", Défense : "+
	this.getBonusDef()+", Esquive : "+ this.getBonusEsq() + ", type : "+ type;
	}

	public MainDroite(String nom, Integer bonusAtk, Integer bonusDef, Integer bonusIni, Integer bonusEsq) {
		super(nom, bonusAtk, bonusDef, bonusIni, bonusEsq);
	}
	
	

}
