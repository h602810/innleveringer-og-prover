package skoleproveUke45.oppg4;

public class ToDoListe {
	  private ToDoElement[] todoTab;
	  private int antall;
	  
	  public ToDoListe(int maksAntall) {
	    todoTab = new ToDoElement[maksAntall];
	  }
	  
	  public void leggTil(ToDoElement tde) {
	    if (antall < todoTab.length) {
	      todoTab[antall] = tde;
	      antall++;
	      System.out.println("ToDoElement lagt til.");
	    }
	    else {
	      System.out.println("Tabellen er full, ToDoElement ikke lagt til.");
	    }
	  }
	  
	  public ToDoElement finnViktig() {
	    int hoyest = 100;
	    int pri = 0, peker = 0;
	    for (int i = 0; i < antall; i++) {
	      pri = ToDoElement.getPrioritet();
	      if(pri < hoyest) {
	        hoyest = pri;
	        peker = i;
	      }
	    }
	    return todoTab[peker];
	  }
	  
	  public void main(String[] args) {
	    ToDoListe liste = new ToDoListe(10);
	    
	    ToDoElement nr1 = new ToDoElement("Bestille ferie", 1, 2);
	    ToDoElement nr2 = new ToDoElement("Bestille mat", 2, 3);
	    
	    leggTil(nr1);
	    leggTil(nr2);
	    
	    System.out.println(finnViktig());
	  }
}