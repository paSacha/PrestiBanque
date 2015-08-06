package metiers;

public class ComptesBancaires {

	private String nomProprio;
	private String decouvert;
	private String tauxRem;

	public ComptesBancaires(String nomProprio, String decouvert, String tauxRem) {
		this.nomProprio = Personnes.getNom();
		this.decouvert = decouvert;
		this.tauxRem = tauxRem;
	}

	// Getters et Setters
	public String getNomProprio() {
		return nomProprio;
	}

	public void setNomProprio(String nomProprio) {
		this.nomProprio = nomProprio;
	}

	public String getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(String decouvert) {
		this.decouvert = decouvert;
	}

	public String getTauxRem() {
		return tauxRem;
	}

	public void setTauxRem(String tauxRem) {
		this.tauxRem = tauxRem;
	}

}
