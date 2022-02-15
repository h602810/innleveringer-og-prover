package Oblig3;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
	@Override
	public String toString() {
		Innlegg[] innlegg = super.getSamling();
		String outTxt = HTMLPREFIX;
		int antall = super.getAntall();
		
		for (int i = 0; i < antall; i++) {
			outTxt += innlegg[i].toHTML();
		}
		
		return outTxt + HTMLPOSTFIX;
	}
}
