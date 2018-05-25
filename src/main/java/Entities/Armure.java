package Entities;

public class Armure extends Equipement {
	
	private String type;

	public Armure(String nom, Integer bonusAtk, Integer bonusDef, Integer bonusIni, Integer bonusEsq) {
		super(nom, bonusAtk, bonusDef, bonusIni, bonusEsq);
		this.type = "Armure";
	}

	public Armure() {
		super();
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.getNom() + " -  Attaque : "+ this.getBonusAtk()+", Défense : "+
	this.getBonusDef()+", Esquive : "+ this.getBonusEsq() + ", type : "+ this.getType();
	}
	

}
