package metiers;

public class Gerants extends Personnes {

	// Attributs
	private String agenceGeree;

	// Constructeur
	public Gerants(String nom, String prenom, String agenceGeree) {
		super(nom, prenom);
		this.agenceGeree = agenceGeree;
	}

	// Getters et Setters
	public String getAgenceGeree() {
		return agenceGeree;
	}

	public void setAgenceGeree(String agenceGeree) {
		this.agenceGeree = agenceGeree;
	}

}
