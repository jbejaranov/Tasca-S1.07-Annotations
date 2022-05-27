package ex2;

public abstract class Treballador {

	protected String nom;
	protected String cognom;
	protected int preu;

	public Treballador(String nom, String cognom, int preu) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	public int calcularSou(int horesTreballades) {

		int sou = horesTreballades * preu;

		return sou;
	}
}
