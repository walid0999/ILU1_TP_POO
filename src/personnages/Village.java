package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois =new Gaulois[nbVillageoisMaximum];
		}
	
	 public void setChef(Chef chef) { 
		 this.chef = chef; 
	 }
	 
	 public void ajouterHabitant(Gaulois gaulois) {
		 villageois[this.nbVillageois] = gaulois;
		 this.nbVillageois += 1;
	 }
	 
	public Gaulois trouverHabitant(int num_villageois) {
		return villageois[num_villageois];
		
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef"+this.chef+"vivent les légendaires gaulois :");
		for(int i=0; i<this.nbVillageois; i++) {
			System.out.println("- "+trouverHabitant(i).getNom());
			
		}
		
	}
	 
	public String getNom() {
		return nom;
		}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		
//		Gaulois gaulois = village.trouverHabitant(30);
		
//      On obtient une erreur du type "Index 30 out of bunds for length 30..."
//		car la fonction va aller chercher un habitant
//		dont son indice est 30, sauf que nous on a mis qu'il y avait 30 villageois max,
//		donc on pourra y aller juste jusqu'à l'indice 29
//		Donc j'ai modifié la fonction pour que ça marche bien sans mettre l'indice qu'il faut
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		
		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(Asterix);
		
//		Pareil que le probleme precedent sauf que là elle renvoie "null", mais avec la modification
//		de la fonction, on est pas obliger de mettre l'indice exacte pour trouver le villageois correct
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
	}
	
}