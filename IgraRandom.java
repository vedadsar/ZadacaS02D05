import java.util.Scanner;

/**
 * Napisati program koji implementira igru pogaðanja brojeva. Raèunar memoriše
 * 
 * neki sluèajno izabrani broj izmeðu 1 i 100 , a zatim korisnik pogaða taj
 * broj. Za svaki
 * 
 * pokušaj, raèunar treba ispisati da li je traženi broj manji, veci ili jednak
 * unesenom
 * 
 * broju. Kada je broj jednak, igra se završava. Igraè može izaci iz igre prije
 * kraja unosom
 * 
 * broja -1.
 * 
 * Nakon sto korisnik pogodi broj ispisati odgovarajucu poruku i broj pokusaja
 * 
 * pogadanja.
 * 
 * @author Vedad
 *
 */

public class IgraRandom {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rBroj = (int) (100 * Math.random());
		int pBroj;
		int minus1 = -1;

		// petlja za pogadjanje broja

		do {
			System.out.println("Unesite broj");
			pBroj = in.nextInt();
			// unos = -1
			if (pBroj == minus1) {
				System.out
						.println("Unijeli ste -1, prekid programa. Slucajan broj je bio"
								+ rBroj);
				return;
			}

			// Ukoliko pogodimo broj
			if (pBroj == rBroj) {
				System.out.println("Cestitamo, pogodili ste !!!!");
				return;
			}

			// Ukoliko je broj veci od randoma
			if (pBroj > rBroj && pBroj < 100 && pBroj > 0) {
				System.out
						.println("Broj koji ste unijeli je veci od naseg broja");
			}

			// Ukoliko je broj manji od randoma
			if (pBroj < rBroj && pBroj < 100 && pBroj > 0) {
				System.out
						.println("Broj koji ste unijeli je manji od naseg broja");
			}

			// Interval brojeva
			if (pBroj < 1 || pBroj > 100) {
				System.out
						.println("Unosite brojeve samo koji su u intervalu izmedju 1 i 100");
			}

		} while (pBroj != rBroj && pBroj != minus1);

	}

}
