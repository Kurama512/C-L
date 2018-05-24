package Entities;

import java.util.ArrayList;
import java.util.List;

public class PieceVide {
	
	public void generatePieceVide(Joueur joueur){
	List<String> descriptions = new ArrayList<String>();
	descriptions.add("La pièce est vide.");
	descriptions.add("Il n'y a rien ici.");
	descriptions.add("La pièce est complètement déserte.");
	descriptions.add("Aucune âme à l'horizon...");
	descriptions.add("Pas d'obstacle en vue...");
	descriptions.add("A part un vieux clou rouillé, rien d'autre...");
	
	Integer index = (int) ((Math.random()*6)+1);
	System.out.println(descriptions.get(index));
	joueur.setScore(joueur.getScore()+10);
	}

}
