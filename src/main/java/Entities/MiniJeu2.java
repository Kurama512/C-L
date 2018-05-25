package Entities;

	 import java.util.InputMismatchException;
	 import java.util.Random;
	 import java.util.Scanner;
	 /**
	  *
	  * @author Formation
	  */
	 public class MiniJeu2 {
	     
	     public Boolean lancerMiniJeu2() {
	         //-------------VARIABLES-------------//
	         String[] tab = {"Pierre", "Feuille", "Ciseaux"};
	         String[] ordiGagne = {"T'es vraiment mauvais!!!","Alala la quiche!!!","Meme ma mere est meilleur que toi!!!"};
	         String[] ordiPerd= {"Tu as le cul bordé de nouilles toi didons!!!!","MAIS NON JE TE MAUDIT PETIT HOMME!!!!!","bien jouer mais c'est du bol!!!!"};
	         String[] egalite={"Non mais t'es un copieur toi!!!!","Ta vraiment pas d'imagination toi!!!!","Tu le fait exprès ou quoi???!!!"};
	         int ordi;
	         int choixJ;
	         int scoreJ=0;
	         int scoreO=0;
	         Random r=new Random();
	         Scanner s=new Scanner(System.in);
	         Boolean find;
	         
	         //--------------------------------------------------------JEU-----------------------------------------------------//
	         
	         System.out.println("Bienvenue l'ami,on va jouer au pierre feuille ciseau,le premier a gagner 3 manches l'emporte");
	         System.out.println("C'EST PARTIE!!!!");
	         
	         do{
	         
	         //-----------------CHOIX DU JOUEUR--------------------//
	         
	         do{
	                 System.out.println("Fait ton choix : 0=Pierre, 1=Feuille, 2=Ciseaux");
	                 choixJ=s.nextInt();
	                 if(choixJ>=3){
	   System.out.println("Mauvaise saisie,tu sais compté jusqu'à 2 ou quoi??!!!");
	                 }
	         }while(choixJ!=0 && choixJ!=1 && choixJ!=2);
	         
	         //-----------------CHOIX DE L'ORDI--------------------//
	         
	         ordi=r.nextInt(3);
	         
	         //-----------------AFFICHAGE DU JEU-------------------//
	  
	                 System.out.println("Tu as joué "+tab[choixJ]+".");
	   System.out.println("J'ai joué "+tab[ordi]+".");
	         
	         //-------------------------EGALITE------------------//
	  
	                 if (choixJ == ordi) {
	    System.out.println("Match nul.");
	                         System.out.println(egalite[ordi]);
	                         System.out.println("Votre score:"+scoreJ+" Mon score:"+scoreO);
	   }
	   else {
	   if ((choixJ == 0) && (ordi == 1) || (choixJ == 1) && (ordi == 2) || (choixJ == 2) && (ordi ==0)) {
	                     System.out.println(ordiGagne[ordi]);
	                     System.out.println("J'ai gagné cette manche, ah ah ah !"); 
	                     scoreO++;
	                     System.out.println("Votre score:"+scoreJ+" Mon score:"+scoreO);
	                         
	   }
	   else {
	                       System.out.println(ordiPerd[ordi]);
	                       System.out.println("Tu as gagné cette manche :(");
	                       scoreJ++;
	                       System.out.println("Votre score:"+scoreJ+" Mon score:"+scoreO);
	                                 
	                       }
	                 }
	         }while(scoreO!=3 && scoreJ!=3);  
	         
	         //-------------CONDITION DE VICTOIRE-----------------//
	         if(scoreO==3){
	             System.out.println("T'es vraiment un mauvais,tu as perdu le match!!!!!!AHAHAHAHAH!!!");
	             find=false;
	             }else{
	                 System.out.println("Tu as gagné le match!!!!!!NOOOOOOOOOOOOOOONNNNNNNNN!!!!");
	                 find=true;
	             }
			return find;
	         }
	     }
	        