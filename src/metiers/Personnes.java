package metiers;

public class Personnes {

	// Attibuts
	private static String nom;
	private String prenom;

	// Constructeur
	public Personnes(String nom, String prenom) {
		super();
		Personnes.nom = nom;
		this.prenom = prenom;
	}

	// Getters et Setters
	public static String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Personnes.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
