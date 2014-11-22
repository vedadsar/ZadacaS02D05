import java.util.Scanner;

/**
 * Dvije firme nude usluge prikljuèenja na Internet, pri èemu prva firma traži
 * fiksnu
 * 
 * pretplatu od 10 KM plus 50 feninga po svakom potrošenom satu, dok druga firma
 * 
 * ne traži fiksnu pretplatu, ali traži 80 feninga po svakom potrošenom satu.
 * Napišite
 * 
 * program koji od korisnika traži da unese željeni broj sati a nakon toga da mu
 * 
 * preporuèi koja je firma isplatnija za njegove potrebe. Na primjer, za 15 sati
 * isplatnija
 * 
 * je druga firma (10 + 15  0.5 = 17.5 > 15  0.8 = 12), dok je za 40 sati
 * isplatnija prva
 * 
 * firma (10 + 40  0.5 = 30 < 40  0.8 = 32).
 * 
 * @author Vedad
 *
 */

public class Internet {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int unos;
		double firmaJedan;
		double firmaDva;
		System.out.println("Unesite broj sati koje provedete na internetu");
		unos = in.nextInt();

		firmaJedan = 10 + 0.5 * unos;
		firmaDva = 0.8 * unos;

		if (firmaJedan < firmaDva) {
			System.out.println("Vise vam se isplati prva firma");
		} else if (firmaJedan > firmaDva) {
			System.out.println("Vise vam se isplati druga firma");
		}

		else if (firmaJedan == firmaDva) {
			System.out.println("Cijene su identicne");
		}

	}
}
