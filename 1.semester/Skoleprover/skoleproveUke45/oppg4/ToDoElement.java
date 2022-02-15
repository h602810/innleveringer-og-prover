package skoleproveUke45.oppg4;

public abstract class ToDoElement {
	  private String beskrivelse;
	  private int nummer;
	  private int prioritet;
	  
	  public ToDoElement(String beskrivelse, int nummer, int prioritet) {
	    this.beskrivelse = beskrivelse;
	    this.nummer = nummer;
	    this.prioritet = prioritet;
	  }
	  
	  public String getBeskrivelse() {
	    return beskrivelse;
	  }
	  
	  public void setBeskrivelse(String beskrivelse) {
	    this.beskrivelse = beskrivelse;
	  }
	  
	  public int getNummer() {
	    return nummer;
	  }
	  
	  public void setNummer(int nummer) {
	    this.nummer = nummer;
	  }
	  
	  public int getPrioritet() {
	    return prioritet;
	  }
	  
	  public void setPrioritet(int prioritet) {
	    this.prioritet = prioritet;
	  }
	  
	  public String toString() {
	    return beskrivelse + "\n" + "Nummer: " + nummer + "\n" + "Prioritet: " + prioritet;
	  }
	  
	}