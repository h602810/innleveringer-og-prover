/* Oppgave O1 - Del av obligatorisk innlevering 2
 * -------------------------------------------------
 * Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.
 */

package Oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		// leser inn bruttoinntekt og bosted
		double brutto = parseDouble(showInputDialog("Oppgi bruttoinntekten din for 2021:"));
		String fylke = showInputDialog("Oppgi hvilket fylke du bor i: \nEksempel: Møre og Romsdal");
		double netto;
		
		// skattetrinn
		double trinn1 = 184800;
		double trinn2 = 260100;
		double trinn3 = 651250;
		double trinn4 = 1021550;
		
		// trinnsats
		double sats1 = 0.017;
		double sats2 = 0.04;
		double sats3TF = 0.112;
		double sats3 = 0.132;
		double sats4 = 0.162;

		
		// beregner trinnskatt (sjekker om man bor i troms/finnmark)
		if (brutto <= trinn1) {
			showMessageDialog(null, "Du må ikke betale trinnskatt!");
		} else if (brutto >= trinn1 && brutto <= trinn2) {
				netto = round(brutto*sats1);
				showMessageDialog(null, "Du må betale " + netto + "kr i trinnskatt (1).");
		} else if (brutto >= trinn2 && brutto <= trinn3) {
				netto = round(brutto*sats2);
				showMessageDialog(null, "Du må betale " + netto + "kr i trinnskatt (2).");
		} else if (brutto >= trinn3 && brutto <= trinn4) {
				if (fylke.equalsIgnoreCase("Troms og Finnmark")) {
					netto = round(brutto*sats3TF);
					showMessageDialog(null, "Du må betale " + netto + "kr i trinnskatt (3).");
				} else {
					netto = round(brutto*sats3);
					showMessageDialog(null, "Du må betale " + netto + "kr i trinnskatt (3).");
				}
		} else if (brutto >= trinn4) {
				netto = round(brutto*sats4);
				showMessageDialog(null, "Du må betale " + netto + "kr i trinnskatt (4).");
		}
		
	}	
}