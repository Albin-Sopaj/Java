
public class Albanian extends Language {
	public Albanian(String languageName, long speakers, String regions, String wdOrder) {
		super(languageName, speakers, "South East Europe, Calabria, Romania", "SVO.");
	}
	
	@Override
	  public void getInfo() {
	    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
	    System.out.println("The language follows the word order: " + this.wordOrder);
	    System.out.println("Fun fact: " + this.name + " forms a unique branch in the Indo European languages Family.");
	  }
}
