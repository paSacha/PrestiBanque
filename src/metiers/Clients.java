package metiers;

public class Clients extends Personnes {

	// Attributs
	private String adresse;
	private String ville;
	private String codePostal;
	private String tel;

	// Construteur
	public Clients(String nom, String prenom, String adresse, String ville, String codePostal, String tel) {
		super(nom, prenom);
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.tel = tel;
	}

	// Getters et Setters
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
