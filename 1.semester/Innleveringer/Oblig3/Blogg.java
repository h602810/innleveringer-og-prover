package Oblig3;

import java.util.Arrays;

//import no.hvl.dat100.jplab11.oppgave1.*; 

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig, plassTab;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
		plassTab = 20;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
		plassTab = lengde;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int pos = 0;
		boolean funnet = false;
		
		while (pos < nesteledig && !funnet) {
			if (innlegg.erLik(innleggtabell[pos])) {
				funnet = true;
			}
			else {
				pos++;
			}
		}
		
		if (funnet) {
			return pos;
		}
		else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {
		int pos = 0;
		boolean funnet = false;
		while (pos < nesteledig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				return true;
			}
			pos++;
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteledig < plassTab;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String tabelltekst = nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			tabelltekst += innleggtabell[i].toString();
		}
		return tabelltekst;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nyTab = new Innlegg[innleggtabell.length*2];
		for (int i = 0; i < nesteledig; i++) {
			nyTab[i] = innleggtabell[i];
		}
		plassTab = nyTab.length;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		}
		if (!ledigPlass()) {
			utvid();
			return true;
		}
		else {
			innleggtabell[nesteledig] = innlegg;
			return true;
		}
	}
	
	public boolean slett(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		if (pos != -1) {
			innleggtabell[pos] = innleggtabell[nesteledig-1];
			innleggtabell[nesteledig-1] = null;
			nesteledig--;
			return true;
		} else {
			return false;
		}
	}
	
	public int[] search(String user, String ord) {
		int[] indexSok = new int[nesteledig];
		int nesteIndex = 0;
		
		for (int i = 0; i < indexSok.length; i++) {
			if(innleggtabell[i].getBruker().equals(user)) {
				indexSok[nesteIndex] = i;
				nesteIndex++;
			}
		}
			
		String idString = "";
		for (int i = 0; i < nesteIndex; i++) {
			int indexUser = indexSok[i];
			if (innleggtabell[indexUser].toString().contains(ord)) {
				idString += innleggtabell[indexUser].getId() + ".";
			}
		}
		
		String[] idStringTab = idString.split("\\.");
		int[] id = new int[idStringTab.length];
		
		for (int i = 0; i < idStringTab.length; i++) {
			id[i] = Integer.parseInt(idStringTab[i]);
		}
		
		Arrays.sort(id);
		return id;
	}
}