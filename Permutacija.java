import java.util.Scanner;

public class Permutacija {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String rijec1;
		String rijec2;
		System.out.println("Unesite prvu rijec");
		rijec1 = in.next();
		System.out.println("Unesite prvu rijec");
		rijec2 = in.next();
		int i;
		int brojac = 0;
		String slovo;
		String slovo2;

		if (rijec1.length() != rijec2.length()) {
			System.out.println("Rijeci nisu iste velicina");
			return;
		}

		for (i = 0; i < rijec1.length(); i++) {
			slovo = "" + rijec1.charAt(i);
			slovo2 = "" + rijec2.charAt(i);
			if (rijec2.contains(slovo) && (rijec1.contains(slovo))
					&& (rijec2.contains(slovo2)) && rijec1.contains(slovo2)) {
				brojac = brojac + 1;
			}

		}

		if (brojac == rijec1.length()) {
			System.out.println("rijecu su permutacija");
		} else {
			System.out.println("Rijeci nisu permutacija");
		}
	}
}
