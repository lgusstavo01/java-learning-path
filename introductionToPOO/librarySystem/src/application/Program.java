package application;

import entities.Book;
import entities.Library;

public class Program {

	public static void main(String[] args) {
		Library lb = new Library();
		
		 Book book1 = new Book("O Senhor dos Anéis", "J.R.R.", true);
	     Book book2 = new Book("1984", "George Orwell", true);
	     Book book3 = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", true);
	     Book book4 = new Book("Orgulho e Preconceito", "Jane Austen", true);
	     Book book5 = new Book("1984", "George Orwell", true); 
		
		boolean booleanBook1 = lb.addBook(book1);
		boolean booleanBook2 = lb.addBook(book2);
		boolean booleanBook3 = lb.addBook(book3);
		boolean booleanBook4 = lb.addBook(book4);
		boolean booleanBook5 = lb.addBook(book5);
		
		System.out.println(booleanBook1);
		System.out.println(booleanBook2);
		System.out.println(booleanBook3);
		System.out.println(booleanBook4);
		System.out.println(booleanBook5);
		
		boolean lendBook = lb.lendBook("1984");
		boolean lendBook1 = lb.lendBook("1984");
		
		System.out.println(lendBook);
		System.out.println(lendBook1);
		
		lb.listAvaliable();
		
		boolean bookReturned = lb.returnBook("1984");
		
		System.out.println(bookReturned);
		
		

		
		lb.listAll();
	}

}
