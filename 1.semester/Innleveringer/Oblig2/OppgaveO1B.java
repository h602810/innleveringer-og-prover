/* Oppgave O1-B - Del av obligatorisk innlevering 2
 * ----------------------------------
 * a) Implementer en metode som kan skrive ut en matrise.
 * 	  Prøv å bruk to to (nøstede) utvvidede for-løkker.
 * b) Implementer en metode som returnerer en streng-
 *    representation av en matrise.
 * c) Implementer en metode som returnerer en ny matrise der
 *    alle tall i matrisen er multiplisert med parameteren
 *    tall. Metoden må først opprette en matrise like stor
 *    som parameteren og så multiplisere alle elementer
 *    med tall.
 * d) Implementer en metode som avgjør om to matriser gitt
 * 	  ved parameterene a og b er like.
 * e) Implementer en metode osm kan speile en kvadratisk 
 * 	  matrise som beskrevet i oppg. 5.17 i Java-boka. 
 * 	  Metoden må først opprette en matrise like stor som
 * 	  parameteren. Etter dette skal metoden kopiere alle
 *    elementene fra parameteren til den nye matrisen og
 *    så speile den nye.
 * f) Implementer en metode som kan multiplisere to matriser.
 *    Test metoden. Antall kolonner i første matrisen må
 *    være lik antall rekker i den andre for at det skal
 *    være lov å multiplisere to matriser.
 */

package Oblig2;

public class OppgaveO1B {
	public static void main(String[] args) {
		int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] b = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		skrivUtv1(a);
		tilStreng(a);
		skrivUtv1(skaler(2, a));
		boolean d = erLik(a,b); System.out.println(d + "\n");
		skrivUtv1(speile(a));
		skrivUtv1(multipliser(a,b));
	}
	
	// a
	public static void skrivUtv1(int[][] matrise) {
		for (int[] i : matrise) {
			for (int j : i) {
				System.out.print(j + "");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// b 
	public static String tilStreng(int[][] matrise) {
		String tab = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				tab += matrise[i][j] + " ";
			}
			tab += " \n";
		}
		System.out.println(tab);
		return tab;
	}
	
	// c
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] mat = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				int multi = tall * matrise[i][j];
				mat[i][j] = multi;
			}
		}
		return mat;
	}
	
	// d
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e
	public static int[][] speile(int [][] matrise) {
		int[][] invertert = new int[matrise.length][matrise.length];
		for (int i = 0; i < matrise.length; i ++) {
			for (int j = 0; j < matrise.length; j++) {
				invertert[j][i] = matrise[i][j];
			}
		}
		return invertert;
	}
	
	// f
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multiplisert = new int[a.length][a[0].length];
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					multiplisert[i][j] = a[i][j] * b[i][j];
				}
			}
		}
		return multiplisert;
	}

	
}
