package ex2;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		TreballadorOnline treballador1 = new TreballadorOnline("Juan", "Bejarano", 10, 20);

		TreballadorOnline treballador2 = new TreballadorOnline("Ana", "Martinez", 15, 20);

		TreballadorPresencial treballador3 = new TreballadorPresencial("Paula", "Gonzalez", 8, 40);

		TreballadorPresencial treballador4 = new TreballadorPresencial("Victor", "Fernandez", 10, 40);

		System.out.println("L'edat de " + treballador1.nom + " es de " + treballador1.calculaEdat(1989) + " anys.");

	}

}
