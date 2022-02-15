package Oblig3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import static javax.swing.JOptionPane.*;

//import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {		
		boolean skrevet = false;
		
		try {
			File file = new File(mappe + filnavn);
			PrintWriter skriver = new PrintWriter(file);
			skrevet = true;
			
			skriver.println(samling.toString());
			skriver.close();
			
		} catch(FileNotFoundException e) {
			showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
		}
		
		
		return skrevet;
	}
}