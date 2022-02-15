package skoleproveUke37;

public class Oppgave5 {

	public static void main(String[] args) {
		double arealsirkel = sirkelAreal(2.3);
		System.out.println(arealsirkel);
	}
		
	public static double sirkelAreal(double x) {
		double areal = Math.PI * Math.pow(x, 2);
		double areal1 = Math.round(areal * 100 ) / 100.0; 	// for å få to desimaler
		return areal1;
	}

}
