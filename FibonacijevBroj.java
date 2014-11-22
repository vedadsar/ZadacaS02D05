import java.util.Scanner;

/**
 * Fibonaèijev niz je niz u kome je svaki elemenat jednak zbiru prethodna dva
 * elementa.
 * 
 * Fibonaèijev niz glasi: 1, 1, 2, 3, 5, 8, 13...;
 */

public class FibonacijevBroj {
	public static void main(String[] args) {

		int unos;
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite redni fibonacijev broj");
		
		unos = in.nextInt();

		// Prva dva broja su 1
		if (unos == 1 || unos == 2) {
			System.out.println("1");
			return;
		}

		
		int fBroj1 = 1;
		int fBroj2 = 1;
		int fBroj = 0 ;
		// Ispitivanje fBroja od 3++
		for (int i = 3; i <= unos; i++) {
			
			fBroj = fBroj1 + fBroj2;
			fBroj1 = fBroj2;
			fBroj2 = fBroj;

		}
		System.out.println(fBroj); 
	}

}
