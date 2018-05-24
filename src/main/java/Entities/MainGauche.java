package Entities;

public class MainGauche extends Equipement {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MainGauche(String nom, Integer bonusAtk, Integer bonusDef, Integer bonusIni, Integer bonusEsq, String type) {
		super(nom, bonusAtk, bonusDef, bonusIni, bonusEsq);
		this.type = "Main gauche";
	}

	public MainGauche() {
		super();
	}

	@Override
	public String toString() {
		return this.getNom() + " -  Attaque : "+ this.getBonusAtk()+", Défense : "+
	this.getBonusDef()+", Esquive : "+ this.getBonusEsq()  + ", type : "+ type;
	}

	public MainGauche(String nom, Integer bonusAtk, Integer bonusDef, Integer bonusIni, Integer bonusEsq) {
		super(nom, bonusAtk, bonusDef, bonusIni, bonusEsq);
	}
	
	

}
