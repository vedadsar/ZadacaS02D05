import java.util.Scanner;
/**Program trazi od korisnika da unese broj a zatim taj broj ispisuje bez nula. 
 * 
 * @author Vedad
 *
 */
public class DeleteZeros {

	public static void main(String[] args) {

		int num = 0, numCopy = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite broj ");
		num = in.nextInt();
		numCopy = num;

		int reversed = 0;

		while (numCopy != 0) {

			while (numCopy % 10 == 0) {
				numCopy /= 10;
			}

			reversed = reversed * 10 + numCopy % 10;
			numCopy /= 10;
		}
		int noviBroj = reversed;
		int reversed1 = 0;

		while (noviBroj != 0) {
			reversed1 = reversed1 * 10 + noviBroj % 10;
			noviBroj = noviBroj / 10;

		}

		System.out.println("Vas broj sa izbrisanim nulama je " +reversed1);
	}

}