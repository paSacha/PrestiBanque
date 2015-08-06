package metiers;

public class Conseillers extends Personnes {

	// Attributs
	private int nbClients;

	// Constructeur
	public Conseillers(String nom, String prenom, int nbClients) {
		super(nom, prenom);
		this.nbClients = nbClients;
	}

	// Getters et Setters
	public int getNbClients() {
		return nbClients;
	}

	public void setNbClients(int nbClients) {
		this.nbClients = nbClients;
	}

}
