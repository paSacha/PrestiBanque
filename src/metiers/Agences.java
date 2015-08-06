package metiers;

public class Agences {

	//Attributs
	private int numID;
	private String dateCrea;
	
	//Constructeur
	public Agences(int numID, String dateCrea) {
		super();
		this.numID = numID;
		this.dateCrea = dateCrea;
	}

	//Getters et Setters
	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public String getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(String dateCrea) {
		this.dateCrea = dateCrea;
	}
	
	
	
}
