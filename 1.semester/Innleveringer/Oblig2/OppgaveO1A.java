/* Oppgave O1-A - Del av obligatorisk innlevering 2
 * ----------------------------------
 * a) Implementer en metode som kan skrive ut en tabell med heltall:
 * b) Implementer en metode som kan returnere en string med innholdet 
 * 	  av en tabell. For en tabell med elementene 42,67,89 skal strengen
 *    "[42,67,89]" returneres.
 * c) Implementer en metode som gitt en tabell som parameter beregner
 * 	  summen av tallene som er lagret i tabellen.
 * 	  Implementer tre varianter av metoden: 
 * 			- en som bruker en vanlig for-løkke
 * 			- en som bruker en while-løkke
 * 			- en som bruker en utvidet for-løkke.
 * 	  Test de ulike implementasjoner av metoden på utvalgte tabeller 
 * 	  og se at de gir riktig resultat. Metoden fra a) kan brukes ifm. test.
 * d) Implementer en metode som gitt en tabell og et tall returnerer
 * 	  true om tabellen tabell inneholder tallet tall og false ellers.
 * e) Implementer en metode som returnerer det første index (posisjon) i
 * 	  tabell som inneholder tallet tall og -1 ellers.
 * f) Implementer en metode som gitt en tabell av heltall returnerer en ny
 * 	  tabell som har de samme elementene som tabell men i motsatt rekkefølge.
 * g) Implementer en metode som kan avgjøre om en array av heltall er sortert
 * 	  stigende. (dvs. at alle tall skal være større enn det forrige)
 * h) Implementer en metode som gitt to tabeller tabell1 og tabell2 som
 * 	  parametre returnerer en ny tabell som er sammensetning av de to tabeller.
 */

package Oblig2;

public class OppgaveO1A {

	public static void main(String[] args) {
		int[] tabell = {76, 3, 52, 5, 23};
		
		// a - test
		skrivUt(tabell);
		
		// b - test (får komma etter siste tall, vet ikke hvordan dette fikses)
		String b = tilStreng(tabell);
		System.out.println(b);
				
		// c - test
		int c = summer(tabell);
		System.out.println(c);
		
		// d - test
		int tallD = 3;
		boolean d = finnesTall(tabell, tallD);
		System.out.println(d);
		
		// e - test
		int tallE = 0;
		int e = posisjonTall(tabell, tallE);
		System.out.println(e);
		
		// f - test
		int[] f = reverser(tabell);
		skrivUt(f);
		
		// g - test
		boolean g = erSortert(tabell);
		System.out.println(g);
		
		// h - test
		int[] tabellH = {1, 2, 4, 9};
		int[] h = settSammen(tabell, tabellH);
		skrivUt(h);
	
	}
	
	// a
	public static void skrivUt (int[] tabell) {
		System.out.print("[");
		for(int i = 0; i < tabell.length; i++) {
			System.out.print(" " + tabell[i]);
		}
		System.out.println(" ]");
	}
	
	// b 
	public static String tilStreng (int[] tabell) {
		String s = "[";
		for(int i = 0; i < tabell.length; i++) {
			s += tabell[i];
				
			if (i < tabell.length - 1) {
				s += ", ";
			}
		}
		s += "]";
		return s;
	}

	// c
	public static int summer (int[] tabell) {
		int sum = 0;
		
		// for-løkke
//		for(int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
		// while-løkke
//		int j = 0;
//		while (j < tabell.length) {
//			sum += tabell[j];
//			j++;
//		}
		
		// utvidet for-løkke
		for(int i : tabell) {
			sum += i;
		}
		
		return sum;
	}
	
	// d 
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean iTab = false;
		for(int i : tabell) {
			if (tall == i) {
				iTab = true;
			}
		}
		return iTab;
	}
	
	// e
	public static int posisjonTall (int[] tabell, int tall) {
		int tallE = -1;
		for(int i = 0; i < tabell.length; i++) {
			if (tall == 0) {
				tallE = tabell[0];
				return tallE;
			}
		}
		return tallE;
	}
	
	// f
	public static int[] reverser(int[] tabell) {
		int temp = tabell.length-1;
		int[] nyTab = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTab[i] = tabell[temp];
			temp -= 1;
		}
		return nyTab;
	}
	
	// g
	public static boolean erSortert (int[] tabell) {
		boolean sortert = true;
		int i = 0;
		while (sortert && i < tabell.length-1) {
			if (tabell[i] > tabell [i+1]) {
				sortert = false;
			}
			i++;
		}
		return sortert;
	}
	
	// h
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int lengde = tabell1.length + tabell2.length;
		int[] fellesTab = new int[lengde];
		for (int i = 0; i < tabell1.length; i++) {
			fellesTab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			fellesTab[tabell1.length + j] = tabell2[j];
		}
		return fellesTab;
	}


}
