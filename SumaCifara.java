import java.util.Scanner;

/**
 * Traziti od korisnika broj a zatim ispisati sumu cifara tog broja. Npr ako
 * korisnik unese
 * 
 * 123 program treba ispisati 6 jer je 1 + 2 + 3 = 6
 * 
 * @author Vedad
 *
 */
public class SumaCifara {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int unos;
		int zbir = 0;
		System.out.println("Unesite vas broj");
		unos = in.nextInt();

		do {

			zbir = zbir + unos % 10;
			unos = unos / 10;

		} while (unos % 10 != 0);

		System.out.println("Zbir cifara vaseg broja je " + zbir);

	}

}
