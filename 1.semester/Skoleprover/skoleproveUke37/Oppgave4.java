package skoleproveUke37;

public class Oppgave4 {

	public static void main(String[] args) {
		int minsteTall = minste(643, 242, 7653);
		System.out.println(minsteTall);
	}
		
	public static int minste(int x, int y, int z) {
	int minst;
		
		if (x <= y && x <= z) {
			minst = x;
		} else if (y <= z && y <= x) {
			minst = y;
		} else {
			minst = z;
		}	
		
		return minst;
	}

}
