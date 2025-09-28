package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;

	public Library() {
		this.books = new ArrayList<Book>();
	}

	public boolean addBook(Book book) {
			if(books.contains(book)) {
				return false;
			}
			
			books.add(book);
			return true;
	}

	public boolean lendBook(String title) {
		for(Book existingBooks : books) {
			if (existingBooks.getTitle().equalsIgnoreCase(title) && existingBooks.isAvaliable() == true) {
				existingBooks.setAvaliable(false);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean returnBook(String title) {
		for(Book existingBooks : books) {
			if (existingBooks.getTitle().equalsIgnoreCase(title) && !existingBooks.isAvaliable()) {
				existingBooks.setAvaliable(true);
				return true;
			}
		}
		return false;
	}
	
	public void listAvaliable() {
		for(Book existingBooks : books) {
			if(existingBooks.isAvaliable()) {
				System.out.println("- " + existingBooks.getTitle() + " - " + existingBooks.getAuthor());
			}
		}
	}
	
	public void listAll() {
		System.out.println("\n--- Books in the Library ---");
		if (books.isEmpty()) {
			System.out.println("Library is empty.");
		} else {
			for (Book book : books) {
				System.out.println("- " + book.getTitle() + " - " + book.getAuthor());
			}
		}
		System.out.println("---------------------------");
	}
}
