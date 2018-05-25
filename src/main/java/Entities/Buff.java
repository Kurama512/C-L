package Entities;

public class Buff {
	
	private String nom;
	private Integer pv;
	private Integer pvMax;
	private Integer esquive;
	private Integer initiative;
	private Integer defense;
	private Integer attaque;
	
	
	public Buff(String nom, Integer pv, Integer pvMax, Integer esquive, Integer initiative, Integer defense,
			Integer attaque) {
		super();
		this.nom = nom;
		this.pv = pv;
		this.pvMax = pvMax;
		this.esquive = esquive;
		this.initiative = initiative;
		this.defense = defense;
		this.attaque = attaque;
	}

	public String toString() {
		return "Buff [nom=" + this.nom + ", pvMax="+ this.pvMax +", Attaque=" + this.attaque + ", defense=" + this.defense + ", initiative=" + this.initiative
				+ ", esquive=" + this.esquive + "]";
	}
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Integer getPv() {
		return pv;
	}


	public void setPv(Integer pv) {
		this.pv = pv;
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
	
	
}
