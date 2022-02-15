/* Oppgave O2 - Del av obligatorisk innlevering 2
 * ------------------------------------------------
 * a) Lag et program som leser inn en poengsum (heltall) 
 *    som en student har oppn�dd p� en pr�ve, og finn og skriv ut den 
 *    karakteren A-F dette tilsvarer. Grenser for de ulike karakterene skal v�re:
 *    A (100-90) B (89-80) C (79-60) D (59-50) E (49-40) F (39-0)
 *    Skriv ut feilmelding ved ugyldig poengsum (negativ verdi eller over 100).
 * b) Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter 
 *    og skrive ut karakteren (eller feilmelding) etter hver innlesing. 
 *    HINT: hvordan kan du bruke en for-l�kke til dette.
 * c) Legg inn kontroll p� innlesinga i programmet i pkt. b) slik at ugyldige poengsummer 
 *    (negativ verdi eller over 100) m� leses inn p� nytt.
 */

package Oblig1;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		// 10 studenter
		for (int i = 1; i <= 10; i++) {
			boolean status = true;

			while (status) {
				int poengsum = parseInt(showInputDialog("Oppgi studentens poengsum: "));
				
				// poengsum kontroll
				if (poengsum > 100 || poengsum < 0) {
					showMessageDialog(null, "Ugyldig poengsum, skriv inn p� nytt.");
					continue;
				}
				
				// poengsum til karakter, og skriver ut
				if (poengsum <= 100 && poengsum >= 90) {
					System.out.println("Student " + i + " oppn�dde karakter A");
					status = false;
				}
				else if (poengsum <= 89 && poengsum >= 80) {
					System.out.println("Student " + i + " oppn�dde karakter B");
					status = false;
				}
				else if (poengsum <= 79 && poengsum >= 60) {
					System.out.println("Student " + i + " oppn�dde karakter C");
					status = false;
				}
				else if (poengsum <= 59 && poengsum >= 50) {
					System.out.println("Student " + i + " oppn�dde karakter D");
					status = false;
				}
				else if (poengsum <= 49 && poengsum >= 40) {
					System.out.println("Student " + i + " oppn�dde karakter E");
					status = false;
				}
				else if (poengsum <= 39 && poengsum >= 0) {
					System.out.println("Student " + i + " oppn�dde karakter F");
					status = false;
				}	
			}	
		}
			
	}	
}