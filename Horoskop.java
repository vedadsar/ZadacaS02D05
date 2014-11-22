import java.util.Scanner;

/**
 * Napravite program koji odreðuje horoskopski znak korisnika! Korisnik treba
 * unijeti
 * 
 * dan i mjesec roðenja, a program ce ispisati odgovarajudi znak u horoskopu.
 * 
 * Datume za pojedine znakove mozete naci ovdje:
 */

public class Horoskop {
	public static void main(String[] args) {

		int dan;
		int mjesec;

		Scanner in = new Scanner(System.in);
		System.out.println("Unesite mjesec rodjenja ");
		mjesec = in.nextInt();
		System.out.println("Unesite dan rodjenja ");
		dan = in.nextInt();

		if (dan < 1 || dan > 31 || mjesec < 1 || mjesec > 12) {
			System.out.println("Unijeli ste pogresan datum.");
			return;
		}

		// ovan March 21 - April 19
		if ((mjesec == 3 && dan >= 21) || (mjesec == 4 && dan <= 19)) {
			System.out.println("Vi ste ovan u horoskopskom znaku");
		}

		// bik April 20 - May 20

		if (mjesec == 4 && dan >= 20 || mjesec == 5 && dan <= 20) {
			if (mjesec == 4 && dan == 31)
				System.out.println("datum nije ispravan");
			else
				System.out.println("Vi ste bik u horoskopskom znaku");
		}

		// blizanac May 21 - June 20

		if (mjesec == 5 && dan >= 21 || mjesec == 6 && dan <= 20) {
			System.out.println("Vi ste blizanac u horoskopskom znaku");
		}

		// rak June 21 - July 22
		if (mjesec == 6 && dan >= 21 || mjesec == 7 && dan <= 22) {
			if (mjesec == 6 && dan == 31)
				System.out.println("datum nije ispravan");
			else
				System.out.println("Vi ste rak u horoskopskom znaku");

		}
		// lav July 23 - August 22
		if (mjesec == 7 && dan >= 23 || mjesec == 8 && dan <= 22) {
			System.out.println("Vi ste lav u horoskopskom znaku");

		}
		// djevica August 23 - September 22
		if (mjesec == 8 && dan >= 23 || mjesec == 9 && dan <= 22) {
			System.out.println("Vi ste djevica u horoskopskom znaku");

		}

		// vaga September 23 - October 22
		if (mjesec == 9 && dan >= 23 || mjesec == 10 && dan <= 22) {
			if (mjesec == 9 && dan == 31)
				System.out.println("datum nije ispravan");
			else
				System.out.println("Vi ste vaga u horoskopskom znaku");

		}

		// skorpija October 23 - November 21
		if (mjesec == 10 && dan >= 23 || mjesec == 11 && dan <= 21) {
			System.out.println("Vi ste skorpija u horoskopskom znaku");
		}

		// strijelac November 22 - December 21
		if (mjesec == 11 && dan >= 22 || mjesec == 12 && dan <= 21) {
			if (mjesec == 11 && dan == 31)
				System.out.println("datum nije ispravan");
			else
				System.out.println("Vi ste strijelac u horoskopskom znaku");
		}

		// jarac December 22 - January 19
		if (mjesec == 12 && dan >= 22 || mjesec == 1 && dan <= 19) {
			System.out.println("Vi ste jarac u horoskopskom znaku");
		}

		// vodolija January 20 - February 18
		if (mjesec == 1 && dan >= 20 || mjesec == 2 && dan <= 18) {
			System.out.println("Vi ste vodolija u horoskopskom znaku");
		}

		// February 19 - March 20
		if (mjesec == 2 && dan >= 19 || mjesec == 3 && dan <= 20) {
			System.out.println("Vi ste riba u horoskopskom znaku");
		}
	}

}
