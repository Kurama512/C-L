package Entities;
//// cette class va cr�er et lancer les mini jeux en fonction d'un num�ros
public class MiniJeu {
	
	public boolean lauchMiniJeu(){
		Integer miniJeu = new Integer((int) (Math.random() * (3 + 1 - 0) + 3));

		switch (miniJeu){
		case 1 : 
			System.out.println("Un homme encapuchonné se trouve au centre de la pièce. \nD'une voix d'outre-tombe, il vous convie à une partie de... \npierre-papier-ciseaux !\n");
			MiniJeu1 game1 = new MiniJeu1();
			return game1.initialisation();
		
		case 2 : 
			System.out.println("La gigantesque pièce dans laquelle vous vous trouvez est en réalité \nune fosse hérissée de pics. Un seul chemin mène aux prochaines portes : un pont branlant...\n");
			MiniJeu2 game2 = new MiniJeu2();
			return game2.lancerMiniJeu2();
			
		case 3 : 
			System.out.println("A votre grande surprise, la pièce ne contient aucune porte.\nUn levier est situé derrière une grille fermée par un cadenas incassable.\nSi vous voulez avancer, vous allez devoir en trouver la combinaison,\nmais ne tardez pas, l'alarme a déjà été sonnée...\n");
			MiniJeu3 game3 = new MiniJeu3();
			return game3.lancer();
		}
		return false;
	}
}
