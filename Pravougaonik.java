/**
 * Napravite program koji na ekranu iscrtava pravougaonik pri èemu su date stranice a i

b pravougaonika. Za iscrtavanje koristite znakove: 

- (minus) za vodoravne linije 

| (pipe) za uspravne 

+ (plus) za coskove. Primjer: 

Primjer izlaza programa:

Unesite stranice pravougaonika: 3 6

+----+

|    |

+----+
 * @author Vedad
 *
 */
import java.util.Scanner;

public class Pravougaonik {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int sirina;
		int duzina;

		System.out.println("Unesite sirinu  ");
		sirina = in.nextInt();

		System.out.println("Unesite duzinu  ");
		duzina = in.nextInt();
		// Prva linija( sirina )
		for (int i = 1; i <= sirina; i++) {
			if (i == 1 || i == sirina) {
				System.out.print("+");
			} else
				System.out.print("-");
		}
		System.out.println();

		// Druga linija ( duzina )
		for (int j = 1; j <= duzina; j++) {
			System.out.print("|");
			//Printanje razmaka
			for (int h = 1; h < sirina - 1; h++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}

		//druga linija sirina
		for (int i = 1; i <= sirina; i++) {
			if (i == 1 || i == sirina) {
				System.out.print("+");
			} else
				System.out.print("-");
		}
		
	}
}
