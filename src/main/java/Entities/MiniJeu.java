package Entities;
//// cette class va cr�er et lancer les mini jeux en fonction d'un num�ros
public class MiniJeu {
	
	public boolean lauchMiniJeu(Integer miniJeu){
		System.out.println("Lancement du mini jeu N "+miniJeu);
		switch (miniJeu){
/*		case 1 : 
			System.out.println("Lancement du jeu");
			MiniJeu1 game1 = new MiniJeu1();
			return game1.lancer();
		
		case 2 : 
			MiniJeu2 game2 = new MiniJeu2();
			return game2.lancer();
			*/
		case 3 : 
			MiniJeu3 game3 = new MiniJeu3();
			return game3.lancer();
		
			
		}
		return false;
	}
}
