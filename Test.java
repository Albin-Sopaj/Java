
public class Test {

	public static void main(String[] args) {
	    //a first object - The Spanish Language, built from constructor
	    Language Spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea",
	    			"SVO.");
	    Spanish.getInfo();	//called the getInfo() method using our object, and that object has its "KEYWORDS"

	    //another object - Chontal; has "KEYWORDS-CLUES"
	    Language Chontal = new Language("\nChontal", 36810, "Central America", "VOS.");
	    Chontal.getInfo();	//get the info for the Chontal language

	    //a third object - Mandarin Chinese; clues and keywords
	    Language MandarinChinese = new Language("\nMandarin Chinese", 920000000, 
	    		"Northern and Southwestern China", "SVO.");
	    MandarinChinese.getInfo();	//get the info for the Mandarin Chinese method
	  
	    //a fourth object - Burmese; 
	    Language Burmese = new Language("\nLolo-Burmese", 5600000, "Eastern China", "SVO." );
	    Burmese.getInfo();	//used the object to access the method and then the method itself printed out something
	    
	    System.out.println();
	    System.out.println(Spanish + " ---> The location on computer's memory.");	//it'll generate the location on memory.
	    
	    System.out.println();
	    //a fifth object
	    Mayan mayan = new Mayan("Mayan", 800000, null, null);
	    mayan.getInfo();
	    
	    //a sixth object - SinoTibetan; a version of Chinese
	    SinoTibetan sinoTibetan = new SinoTibetan("\nSinto Tibetan", 1_300_000_000);
	    sinoTibetan.getInfo();
	    
	    System.out.println();
	    //a seventh object - Albanian language
	    Albanian albanian = new Albanian("Albanian", 7_600_000, null, null);
	    albanian.getInfo();
	    
	    System.out.println();
	    //an eigth object - Italian; Latin language
	    Language italian = new Language("Italian", 67_000_000, "Italy and Southern Switzerland", "SVO.");
	    italian.getInfo();
	}
}
