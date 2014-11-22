import java.util.Scanner;

/**
 * Napisati program koji ce izraèunati presjek skupova S1 i S2 . Skupovi su
 * zadani
 * 
 * intervalima realnih brojeva:
 * 
 * @author Vedad
 *
 */
public class Skupovi {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a, b, c, d;

		// Definisati skup 1
		System.out.println("Unesite pocetni i krajnji broj skupa 1 ");
		a = in.nextInt();
		b = in.nextInt();
		if (a > b) {
			System.out
					.println("Prvi broj mora biti manji od drugog, vas skup nije ispravan");
			return;
		}
		// Definisati skup 2
		System.out.println("Unesite pocetni i krajnji broj skupa 2 ");
		c = in.nextInt();
		d = in.nextInt();
		if (c > d) {
			System.out
					.println("Prvi broj mora biti manji od drugog, vas skup nije ispravan");
			return;
		}

		// Ukoliko se brojevi ne sijeku
		if (b < c) {
			System.out.println("Skupovi se ne sijeku");
			return;
		}

		// Ako skup 1 sadrzi skup 2
		if (c > a && d < b) {
			System.out.println("Skup 2 je sadrzan u skupu 1");
			return;
		}

		// Ako skup 2 sadrzi skup 1
		if (c < a && d > b) {
			System.out.println("Skup 1 je sadrzan u skupu 2");
			return;
		}

		// Ako se skupovi sijeku 1*

		if (b > c && b < d) {
			System.out.printf("Presjek skupa je [%-3d %3d]", b, c);
			return;
		}

		// Ako se skupovi sijeku 2*

		if (d > a && d < b) {
			System.out.printf("Presjek skupa je [%-3d %3d]", d, a);
			return;
		}

	}

}
