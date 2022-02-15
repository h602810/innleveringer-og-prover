package skoleproveUke45.oppg5;

public class SnarestMulig extends Bestilling {
	  private int maxtid;
	  
	   public SnarestMulig(String navn, int kontaktnummer, String adresse, int maxtid) {
	    super(navn, kontaktnummer, adresse);
	    this.maxtid = maxtid;
	  }
	  
	  public String skrivUt() {
	    return getKontaktnr() + " | " + getNavn() + " | " + getAdresse() + " | " + maxtid;
	  }
	  
}