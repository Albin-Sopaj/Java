import java.util.ArrayList;

public class Book {
	private String name, author, publishingHouse;
	private int length, ISBN;	//length is given in pages
	private ArrayList<BookData> info;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		info = new ArrayList<BookData>();
	}

	public void addInfo(BookData newInfo) {
		info.add(newInfo);
	}
	
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public int getLength() {
		return length;
	}

	public int getISBN() {
		return ISBN;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append("Name: ").append(name).append("\n");
		output.append("Author: ").append(author).append("\n");
		output.append("Information: ").append("\n");
		for(BookData e : info)
			output.append(e.toString());
		System.out.println("--------------------");
		return output.toString() + " pages";
			
	}
}
