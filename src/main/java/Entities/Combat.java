package Entities;

import java.util.ArrayList;
import java.util.List;

public class Combat {
	private List<Monstre> lstMonster = new ArrayList();
	private Joueur joueur;
	private Monstre monstre;

	public Combat(Joueur joueur) {
		this.joueur = joueur;
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
		int index = (int) (Math.random()*lstMonster.size());
		setMonstre(lstMonster.get(index));
		
	}

	/*public Integer lancerCombat(){
		//si le retour et 0 le monstre gagne fin de partie
		//si le retour et 1 le joueur est vainqueur 
		
		if(joueur.getPv() > 0 && monstre.getPv() > 0)
			lancerCombat();
		
		if(monstre.getPv() < 0)
			return 1;
		else
			return 0;
		
	}*/
	
}
