package metiers;

import Services.GestionComptes;

public class ComptesBancaires implements GestionComptes{

	// Attributs
	private String nomProprio;
	private String decouvert;
	private String tauxRem;

	// Constructeur
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

	@Override
	public double virement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean auditComptes() {
		// TODO Auto-generated method stub
		return false;
	}

}
