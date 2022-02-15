package skoleproveUke37;

public class Oppgave1 {

	public static void main(String[] args) {
	// a
	int a = -4;
	if (a < 0) {
		System.out.println("Verdien a er mindre enn 0");
		} else if (a == 0) {
		System.out.println("Verdien a er lik 0");
		} else {
		System.out.println("Verdien a er større enn 0");
		}

	// b
	a = 4;
	if (a >= 5 && a <= 8) {
		System.out.println(a + " er innenfor intervallet");
	} else {
		System.out.println(a + " er utenfor intervallet");

	}
	
	// c
	int tall = 2;
	String svar = "";
	
	switch (tall) {
	case 0: 
			svar = "null";
			break;
	case 1: 
		svar = "en";
		break;
	case 2: 
		svar = "to";
		break;
	case 3: 
		svar = "tre";
		break;
	case 4: 
		svar = "fire";
		break;
	default: 
		svar = "ulovlig verdi";
	}
	
	System.out.println(svar);
	
	}
}