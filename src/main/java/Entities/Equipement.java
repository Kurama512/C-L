package Entities;

abstract class Equipement {

	private String nom;
	private Integer bonusAtk;
	private Integer bonusDef;
	private Integer bonusIni;
	private Integer bonusEsq;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getBonusAtk() {
		return bonusAtk;
	}
	public void setBonusAtk(Integer bonusAtk) {
		this.bonusAtk = bonusAtk;
	}
	public Integer getBonusDef() {
		return bonusDef;
	}
	public void setBonusDef(Integer bonusDef) {
		this.bonusDef = bonusDef;
	}
	public Integer getBonusIni() {
		return bonusIni;
	}
	public void setBonusIni(Integer bonusIni) {
		this.bonusIni = bonusIni;
	}
	public Integer getBonusEsq() {
		return bonusEsq;
	}
	public void setBonusEsq(Integer bonusEsq) {
		this.bonusEsq = bonusEsq;
	}
	public Equipement(String nom, Integer bonusAtk, Integer bonusDef, Integer bonusIni, Integer bonusEsq) {
		super();
		this.nom = nom;
		this.bonusAtk = bonusAtk;
		this.bonusDef = bonusDef;
		this.bonusIni = bonusIni;
		this.bonusEsq = bonusEsq;
	}
	public Equipement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Equipement [nom=" + nom + ", bonusAtk=" + bonusAtk + ", bonusDef=" + bonusDef + ", bonusIni=" + bonusIni
				+ ", bonusEsq=" + bonusEsq + "]";
	}
	
	
	
}
