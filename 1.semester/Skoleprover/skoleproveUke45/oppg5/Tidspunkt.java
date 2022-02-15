package skoleproveUke45.oppg5;

public class Tidspunkt extends Bestilling {
	  private String dato;
	  private String tidspunkt;
	  
	  public Tidspunkt(String navn, int kontaktnummer, String adresse, String dato, String tidspunkt) {
	    super(navn, kontaktnummer, adresse);
	    this.dato = dato;
	    this.tidspunkt = tidspunkt;
	  }
	  
	  public String skrivUt() {
	    return getKontaktnr() + " | " + getNavn() + " | " + getAdresse() + " | " + dato + " | " + tidspunkt;
	  }
	  
}