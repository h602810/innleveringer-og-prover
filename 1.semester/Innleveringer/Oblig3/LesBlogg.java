package Oblig3;

import static javax.swing.JOptionPane.showMessageDialog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//import no.hvl.dat100.jplab11.oppgave1.*;
//import no.hvl.dat100.jplab11.oppgave2.*;
//import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

		Blogg blogg = null;
		
		try {
			File file = new File(mappe + filnavn);
			Scanner leser = new Scanner(file);
			int size = Integer.parseInt(leser.nextLine());
			
			blogg = new Blogg(size);
			int nesteledig = 0;
			
			while (leser.hasNextLine()) {
				
				String linje = leser.nextLine();
				
				if (linje.equals(TEKST)) {
					int id = Integer.parseInt(leser.nextLine());
					String bruker = leser.nextLine();
					String dato = leser.nextLine();
					int likes = Integer.parseInt(leser.nextLine());
					String tekst = leser.nextLine();
					
					Tekst innlegg = new Tekst(id, bruker, dato, likes, tekst);
					blogg.leggTil(innlegg);
				}
				else if (linje.equals(BILDE)) {
					int id = Integer.parseInt(leser.nextLine());
					String bruker = leser.nextLine();
					String dato = leser.nextLine();
					int likes = Integer.parseInt(leser.nextLine());
					String tekst = leser.nextLine();
					String url = leser.nextLine();
					
					Bilde innlegg = new Bilde(id, bruker, dato, likes, tekst, url);
					blogg.leggTil(innlegg);
				}
			}
			leser.close();
			
			
		} catch(FileNotFoundException e) {
			showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
		}
		
		return blogg;
	}
}
