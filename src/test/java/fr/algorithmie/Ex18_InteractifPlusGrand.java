package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Veuillez saisir un nombre : ");
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
	
		int nb = scanner.nextInt();
		int compteur=0;
		int [] tab=new int [10];
		while(compteur<10) {
			 nb = scanner.nextInt();
			 tab[compteur]=nb;
			 compteur++;
			 Resultat.log(nb);
		}
		System.out.println("taille "+compteur);
		int max=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]>max) {
				max=tab[i];
			}
		}
		Resultat.log(max);
		scanner.close();
	}

}
