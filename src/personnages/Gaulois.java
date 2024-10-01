package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom; 
		this.force = force; 
	}

	public String getNom() {
		return nom;
		}
	
//	///Nouvelle fonction pour pouvoir obtenir la force
//	public int getForce() {
//		return force;
//		}
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*this.effetPotion);
		}
	

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		}
	
	public void boirePotion(int force) {
		this.effetPotion = force;
		System.out.println("«MerciDruide,je sens que ma force est"+ force+ "fois décuplée");
	}
	
	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Asterix", 9);
//		Romain romain = new Romain("Romain", 16);
//		asterix.boirePotion(5);
//		asterix.frapper(romain);
	}
}


