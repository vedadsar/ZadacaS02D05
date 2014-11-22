/**
 * Napisati program koji uèitava koeficijente a, b I c koji su realnog tipa. Ti koeficijenti

odreðuju funkciju:

f(x) = a * x2

Program treba da provjeri da li su koeficijenti u intervalu od -10 do 10 . Ako nisu, 

program ispisuje poruku:

Ako koeficijenti a, b I c jesu u zadanom intervalu, program kao izlaz daje vrijednost 

funkcije u taèki . Taèka se takoðer unosi sa standardnog ulaza.

 + b * x + c

Koeficienti a, b, c nisu u zadanom interval
 * @author Vedad
 *
 */
import java.util.Scanner;

public class KvadratnaFunkcija {
	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int minus10 = (-10);

		// Unosimo koeficijente a,b,c
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite a ");
		a = in.nextInt();

		System.out.println("Unesite b ");
		b = in.nextInt();

		System.out.println("Unesite c ");
		c = in.nextInt();

		// Provjeravamo interval
		if ((a < minus10 || a > 10) || (b < minus10 || b > 10)
				|| (c < minus10 || c > 10)) {
			System.out
					.println("Brojevi koje ste unijeli nisu u intervalu od -10 do 10");
			return;
		}
		// Unosimo x
		int x;
		System.out.println("Unesite x");
		x = in.nextInt();

		// rijesavamo funkciju

		int f = a * x * x + b * x + c;
		System.out.println("Rijesenje: f(" + x + ")=" + f);

	}
}
