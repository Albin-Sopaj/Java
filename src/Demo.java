
public class Demo {

	public static void main(String[] args) {
		
		Book myWar = new Book("Mein Kampf", "Adolf Hitler");
		myWar.addInfo(new BookData("Hieronymites", 720, "0-395-92503-7"));
		System.out.println(myWar);
		
		Book daVinciCode = new Book("DaVinci Code", "Dan Brown");
		daVinciCode.addInfo(new BookData("Bota shqiptare", 689, "0-385-50420-9"));
		System.out.println(daVinciCode);
	}

}
