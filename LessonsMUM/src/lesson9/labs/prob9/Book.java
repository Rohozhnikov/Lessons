package lesson9.labs.prob9;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Book {
	private List<BookCopy> copies = new ArrayList<BookCopy>();
	private String title;
	public Book(String title, int numCopies) {
		if(numCopies < 1) throw new IllegalArgumentException(
				"NumCopies must be positive");
		this.title= title;
		for(int i = 0; i < numCopies; ++i) {
			addCopy();
		}
	}
	public List<BookCopy> getCopies() {
		return copies;
	}
	public void addCopy() {
		BookCopy copy = new BookCopy(this, copies.size() + 1, true);
		copies.add(copy);
	}
	boolean isAvailable(){
		
		return copies.stream().map(c-> c.isAvailable()).reduce((a,b) -> a||b).get();
	}
	
	public static void main(String[] args) {
		Book book  = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(c -> c.changeAvailability());
		System.out.println(book.isAvailable());
	}
}
