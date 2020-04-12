
public class BookData {
	private String publishingHouse;
	private String ISBN;
	private int length;
	
	public BookData(String publishingHouse, int length, String ISBN) {
		this.publishingHouse = publishingHouse;
		this.length = length;
		this.ISBN = ISBN;
	}
	
	public String getPublishingHouse() {
		return publishingHouse;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		return "Publishing House: " + getPublishingHouse() + "\nISBN: " + getISBN() + "\nLength: " + getLength();
	}
}
