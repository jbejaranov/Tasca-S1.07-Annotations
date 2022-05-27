package ex2;

public class TreballadorOnline extends Treballador {
	final int tarifaInternet;

	public TreballadorOnline(String nom, String cognom, int preu, int tarifaInternet) {
		super(nom, cognom, preu);
		// TODO Auto-generated constructor stub
		this.tarifaInternet = tarifaInternet;

	}

	public int getTarifaInternet() {
		return tarifaInternet;
	}

	@Override
	public int calcularSou(int horesTreballadesMes) {

		int sou = (horesTreballadesMes * preu) + tarifaInternet;

		return sou;
	}

	@Deprecated
	public int calculaEdat(int anyNaixement) {

		int edat = 2022 - anyNaixement;

		return edat;
	}

}
