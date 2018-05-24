package Entities;

public class Monstre {

	private String nom;
	private Integer pv;
	private Integer pvMax;
	private Integer attaque;
	private Integer initiative;
	private Integer defense;
	private Integer esquive;
	
	public Monstre() {
		
	}
	


	public Monstre(String nom, Integer pv, Integer pvMax, Integer attaque, Integer initiative, Integer defense,
			Integer esquive) {
		super();
		this.nom = nom;
		this.pv = pv;
		this.pvMax = pvMax;
		this.attaque = attaque;
		this.initiative = initiative;
		this.defense = defense;
		this.esquive = esquive;
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

	public Integer getAttaque() {
		return attaque;
	}

	public void setAttaque(Integer attaque) {
		this.attaque = attaque;
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

	public Integer getEsquive() {
		return esquive;
	}

	public void setEsquive(Integer esquive) {
		this.esquive = esquive;
	}



	public Integer getPvMax() {
		return pvMax;
	}



	public void setPvMax(Integer pvMax) {
		this.pvMax = pvMax;
	}
	
	
	
}
