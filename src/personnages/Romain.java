package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[];
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom; 
		this.force = force;
		}
	
	public String getNom() {
		return nom; 
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
		}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "La force d'un Romain doit être positive";
		int force_debut = force;
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
			}
		assert force_debut > force : "La force d'un Romain  doit diminuer apres le coup";
		}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2: {
			System.out.println("Le soldat"+nom+ "est déjà bien protégé!");
			break;
		}
		case 1:{
			if(equipements[nbEquipement-1] == equipement) {
				System.out.println("Le soldat"+nom+ "possède déjà un ");
				break;
				
			}
		}
		}
		
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Asterix", 6);
		
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
	}
	
} 
