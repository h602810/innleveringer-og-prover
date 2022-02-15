package skoleproveUke37;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {

		int heltall = 0, antall = -1, sum = 0; // -1 på antall for å ikke ha med 0 som del av totalen i antall
	
		do {
			heltall = parseInt(showInputDialog("Oppgi et heltall: \n'0' for å avslutte programmet."));	
			sum += heltall;
			antall++;
		} while (heltall != 0);
			
		System.out.println("Antall tall: " + antall + "\nSum: " + sum);
	}
}
