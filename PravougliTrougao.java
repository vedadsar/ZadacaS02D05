import java.util.Scanner;

/**
 * Napisati program koji prima 2 broja. Ovi brojevi predstavljaju duzine dviju
 * stranica
 * 
 * pravouglog trougla. Program treba da ispise duzinu trece stranice. Obratite
 * paznju da
 * 
 * ovdje treca stranica moze biti realan broj (double).
 * 
 * Za unos 5 i 3 program treba da izbaci 4.
 * 
 * @author Vedad
 *
 */
public class PravougliTrougao {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double a;
		double b;

		System.out.println("Unesite stranicu a ");
		a = in.nextInt();

		System.out.println("Unesite stranicu b  ");
		b = in.nextInt();

		for (int i = 1; i < a + b; i++) {
			double c = i;

			// Ispitivanje stranica
			if ((a == Math.sqrt(b * b + c * c))
					|| (b == Math.sqrt(a * a + c * c))
					|| (c == Math.sqrt(b * b + a * a))) {
				System.out
						.println("Stranica koja odgovoara pravouglom trouglu sa stranicama koje ste unijeli je "
								+ c);
				return;

			}

		}

		System.out
				.println("Nije pronadjena stranica koja odgovara pravouglom trouglu");
	}
}
