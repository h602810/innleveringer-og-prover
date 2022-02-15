package skoleproveUke45.oppg5;

public abstract class Bestilling {
	  private int kontaktnummer;
	  private String kundenavn;
	  private String adresse;
	  
	  public Bestilling(String navn, int kontaktnummer, String adresse) {
	    kundenavn = navn;
	    this.kontaktnummer = kontaktnummer;
	    this.adresse = adresse;
	  }
	  
	  public int getKontaktnr() {
	    return kontaktnummer;
	  }
	  
	  public void setKontaktnr(int kontaktnummer) {
	    this.kontaktnummer = kontaktnummer;
	  }
	  
	  public String getNavn() {
	    return kundenavn;
	  }
	  
	  public void setNavn(String navn) {
	    kundenavn = navn;
	  }
	  public String getAdresse() {
	    return adresse;
	  }
	  
	  public void setAdresse(String adresse) {
	    this.adresse = adresse;
	  }
	  
	  public String skrivUt() {
	    return kontaktnummer + " | " + kundenavn + " | " + adresse;
	  }
	  
	  public void main(String[] args) {
	    Bestilling nr1 = new Bestilling("Sindre", 123, "Bergen", 30);
	    
	    skrivUt();
	  }
}