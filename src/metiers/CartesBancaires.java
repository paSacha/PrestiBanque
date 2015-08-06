package metiers;

public class CartesBancaires {

	// Atributs
	private String typeCarte;
	private String nomProprio;

	// Constructeur
	public CartesBancaires(String typeCarte) {
		super();
		this.typeCarte = typeCarte;
		this.nomProprio = Personnes.getNom();
	}

}
