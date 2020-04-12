
public class SinoTibetan extends Language {
		//constructor
	  SinoTibetan(String languageName, long speakers) {
	    super(languageName, speakers, "Asia", "SOV.");
	    if(languageName.contains("Chinese")) {
	      this.wordOrder = "subject-verb-object";
	    }
	 }
}