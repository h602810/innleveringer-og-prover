/* Oppgave O3 - Del av obligatorisk innlevering 2 
 * ----------------------------------------------
 * Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) 
 * og skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n.
 */

package Oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		// les inn heltall større enn 0, beregn verdien n fakultet, skriver ut verdien til n!
		int tall = parseInt(showInputDialog("Oppgi heltall: "));
		int fakultet = 1;
		
		if (tall <= 0) {
			showMessageDialog(null, "Ugyldig tall, må være større enn 0");
		} else {
			for (int i = 1; i <= tall; i++) {
				fakultet *= i;
			}
			System.out.println("Fakultetet av " + tall +  " = " + fakultet);
		}
		
	}	
}