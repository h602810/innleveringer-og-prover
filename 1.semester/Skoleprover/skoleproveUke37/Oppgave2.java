package skoleproveUke37;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
		/* Usikker om «utskrift på skjermen» i oppgaveteskten mente 
		 * om man skulle ha vinduutskrift (showMessageDialog) 
		 * eller om det skulle komme i konsollen så lagde begge.
		*/
		
		for (int i = 2; i < 7; i++) {
			int sum = 10 / i;
			System.out.println("10 / " + i + " = " + sum);
		}

		String melding = "";
		for (int i = 2; i < 7; i++) {
			int sum = 10 / i;
			melding += ("10 / " + i + " = " + sum + "\n");
		}
			
		showMessageDialog(null, melding);
		
	}

}
