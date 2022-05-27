package ex1;

public class TreballadorPresencial extends Treballador {
	static int benzina;

	public TreballadorPresencial(String nom, String cognom, int preu, int benzina) {
		super(nom, cognom, preu);
		// TODO Auto-generated constructor stub

		this.benzina = benzina;
	}

	public int getBenzina() {
		return benzina;
	}

	public void setBenzina(int benzina) {
		this.benzina = benzina;
	}

	@Override
	public int calcularSou(int horesTreballadesMes) {

		int sou = (horesTreballadesMes * preu) + benzina;

		return sou;
	}

}
