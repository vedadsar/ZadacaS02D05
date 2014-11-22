import java.util.Scanner;

/**
 * Napišite program koji ucitava “string” i broj . Prvi parametar predstavlja neku

reèenicu, a drugi parametar redni broj rijeèi unutar te reèenice. Program treba da 

izdvoji tu rijeè iz reèenice, i da je ispise na ekran.
 * @author Vedad
 *
 */

public class StringsZadaca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String recenica;
		System.out.println("Unesite vasu recenicu");
		recenica = in.nextLine();
		char space = ' ';
		int broj;
		System.out.println("Unesite broj rijeci koju hocete da izdvojimo");
		broj = in.nextInt();
		int i;
		int j;
		int brojac = 1;
		int brojac1 = 1;
        recenica = recenica.trim();
        String razmak;
       int brojRazmaka = 0;
        
        
       
		// Trazenje rijeci
		for (i = 0; i < (recenica.length() - 1); i++) {

			if (recenica.charAt(i) == space) {
				if  (recenica.charAt(i+1)==space  &&  recenica.charAt(i+1)==space){
					
							brojac=brojac-1;
				}
				brojac = brojac + 1;//Ukoliko je charAt(i) = 0, brojac povecavamo za 1.
			}

			if (brojac == broj) {
				break;// Kada brojac bude jednak nasem unesenom broju, izlazimo iz petlje.
			}

		}

		// odabir samo jedne rijeci // Pocinjemo od rijeci koja nam treba.
		String noviPocetak = recenica.substring(i + 1);
		for (j = 0; j < (noviPocetak.length() - 1); j++) {

			if (noviPocetak.charAt(j) == space) {
				break;
			}

			if (noviPocetak.charAt(j) != space) {
				brojac1 = brojac1 + 1;// Brojimo slova do razmaka da znamo velicinu rijeci.
			}

		}
		String pravaRijec = noviPocetak.substring(0, brojac1);

		System.out.println("Rijec koju ste trazili je " + pravaRijec);
		return;

	}
}
