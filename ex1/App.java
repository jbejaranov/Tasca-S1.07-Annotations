package ex1;

public class App {

	public static void main(String[] args) {

		TreballadorOnline treballador1 = new TreballadorOnline("Juan", "Bejarano", 10, 20);

		TreballadorOnline treballador2 = new TreballadorOnline("Ana", "Martinez", 15, 20);

		TreballadorPresencial treballador3 = new TreballadorPresencial("Paula", "Gonzalez", 8, 40);

		TreballadorPresencial treballador4 = new TreballadorPresencial("Victor", "Fernandez", 10, 40);

		System.out.println("El sou total de " + treballador1.nom + " es de " + treballador1.calcularSou(8) + "€.");

		System.out.println("El sou total de " + treballador2.nom + " es de " + treballador2.calcularSou(12) + "€.");

		System.out.println("El sou total de " + treballador3.nom + " es de " + treballador3.calcularSou(14) + "€.");

		System.out.println("El sou total de " + treballador4.nom + " es de " + treballador4.calcularSou(16) + "€.");
	}

}
