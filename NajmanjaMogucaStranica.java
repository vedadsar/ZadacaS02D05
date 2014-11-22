import java.util.Scanner;

/**
 * Napisati program koji od korisnika uzima dva broja a ispisuje treci broj koji
 * 
 * predstavlja najmanju mogucu duzinu koju treca stranica treba imati tako da te
 * tri
 * 
 * duzine predstavljaju stranice trougla. Za unos 4 i 5 program treba izbaciti
 * 2. Prisjetiti
 * 
 * se da je uslov da 3 duzine budu stranice trougla je da su sve duzine
 * pozitivne I da je
 * 
 * zadovoljeno pravilo a + b > c, a + c > b i b + c > a.
 * 
 * @author Vedad
 *
 */
public class NajmanjaMogucaStranica {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a;
		int b;

		System.out.println("Unesite stranicu a ");
		a = in.nextInt();

		System.out.println("Unesite stranicu b  ");
		b = in.nextInt();

		// Ukoliko unosi nisu pozitivni
		if (a <= 0 || b <= 0) {
			System.out
					.println("Brojevi koje ste unijeli nisu ispravni, mozete unijeti samo pozitivne brojeve");
			return;
		}

		// Trazenje trece stranice
		for (int i = 1; i < (a + b); i++)
			if (a + i > b && b + i > a) {
				System.out.println("c = " + i + " je najmanja moguca stranica");
				return;
			}

	}
}
