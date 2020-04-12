
public class Language {
	//attributes
	public String name, regionsSpoken, wordOrder;
	protected long numSpeakers;

	//the constructor needed for building objects.
	public Language(String langName, long speakers, String regions, String wdOrder) {
	    this.name = langName;
	    this.numSpeakers = speakers;
	    this.regionsSpoken = regions;
	    this.wordOrder = wdOrder;
	}
  
	//the method will return a result when called from different objects.
	public void getInfo() {
		
	    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
	    System.out.println("The language follows the word order: " + this.wordOrder);
	  
	}
}