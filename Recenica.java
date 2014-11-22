import java.util.Scanner;

/**
 * Od korisnika traziti da unese recenicu (sa razmacima) i odredeno slovo. Na
 * konzolu
 * 
 * ispisati istu redenicu bez tog slova.
 * 
 * Primjer:
 * 
 * Unesite recenicu:
 * 
 * PeoplE are strange when you’re a stranger.
 * 
 * Unesite slovo:
 * 
 * Popl ar strang whn you’r a strangr
 * 
 * @author Vedad
 *
 */

public class Recenica {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String unos;
		String slovo;
		String noviUnos;
		System.out.println("Unesite vasu recenicu");
		unos = in.nextLine();

		System.out.println("Unesite slovo");
		slovo = in.next();
		
		// Ukoliko je slovo neispravno unijeto.
		if(slovo.length()>1){
			System.out.println("Unijeli ste neispravno slovo");
			return;
		}
        
		
		// u Slucaju da je uneseno slovo malo.
		if(slovo.toLowerCase().equals(slovo)) {
		String slovoA = slovo.toUpperCase();
		noviUnos = unos.replaceAll(slovo, "");
		noviUnos = noviUnos.replaceAll(slovoA,"");		
		System.out.println(noviUnos);
        }
		
		// u Slucaju da je uneseno slovo veliko.
				if(slovo.toUpperCase().equals(slovo)) {
				String slovoA = slovo.toLowerCase();
				noviUnos = unos.replaceAll(slovo, "");
				noviUnos = noviUnos.replaceAll(slovoA,"");		
				System.out.println(noviUnos);
				
				
				}
				
		
	}
	
	
}
