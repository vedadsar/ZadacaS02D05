/**
 * Napišite program koji traži da se sa tastature unese prirodan broj n. U sluèaju

da korisnik unese nešto što nije prirodan broj treba ispisati poruku upozorenja, i 

ponoviti unos. Ukoliko je unos ispravan, program treba da izraèuna i ispiše sumu svih 

djelilaca broja n. Na primjer, za n = 12 treba ispisati vrijednost 28, jer su djelioci broja 

12 brojevi 1, 2, 3, 4, 6 i 12, a 1 + 2 + 3 + 4 + 6 + 12 = 28. Nakon toga, program treba 

da traži unos novog broja i da ponavlja postupak sve dok se kao broj ne unese nula.
 * @author Vedad
 *
 */
import java.util.Scanner;

public class ZbirDjelioca {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int unos;
		int zbir = 0;
		System.out.println("Unesite broj");
		unos = in.nextInt();
		
		// Provjeravanje da li je n prirodan broj
		while (unos < 0) {
			System.out.println("Unesite broj");
			unos = in.nextInt();					
		}
				
		// Sabiranje djelioca
		for (int i = 1; i <= unos; i++) {

			if (unos % i == 0) {
				zbir = zbir + i;
			}

		}
           
		System.out.println("Suma djelilaca vaseg broja je " +zbir);

	}
}
