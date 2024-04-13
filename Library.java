package library;

import java.util.ArrayList;

public interface Library {
	void searchByTitle(String title);
	void searchByAuthor(String author);
	void searchByType(String type);
	void reserved(String title,String author);
	void addBook(ArrayList<Book> ar);
	void addBook(Book book);
}
