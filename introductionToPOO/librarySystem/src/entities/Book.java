package entities;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private boolean avaliable = true;
	
	public Book() {}
	
	public Book(String title, String author, boolean avaliable) {
		this.title = title;
		this.author = author;
		this.avaliable = avaliable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return String.format(
			    "\n----- Book Data -----\n" +
			    "Author: %d\n" +
			    "Title: %s\n" +
			    "Avaliable: %d",
			    author, title, avaliable);
	}
}
