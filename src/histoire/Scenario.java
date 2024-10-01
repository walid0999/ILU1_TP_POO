package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Druide panoramix = new Druide("Paronamix",5,10);
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10");
		
	}
}
