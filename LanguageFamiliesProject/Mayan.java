
public class Mayan extends Language {
	
	//constructor
	public Mayan(String languageName, long speakers, String regions, String wdOrder) {
	  super(languageName, speakers, "Central America", "Verb-Object-Subject");
	  }
	
	  @Override
	  public void getInfo() {
	    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
	    System.out.println("The language follows the word order: " + this.wordOrder);
	    System.out.println("Fun fact: " + this.name + " is an ergative language.");
	  }
}