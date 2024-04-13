package library;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
class LibraryImp implements Library {
    static List<Book> books=new ArrayList<>();
    
    static Set<Book>bk1=new HashSet<Book>(books);

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
            }
    }
    
    public void searchByTitle(String title)
    {
    	if(books.contains(title))
    	{
    		
    	}
    }
    public void searchByAuthor(String author)
    {
    	System.out.println("I am from author");
    }
    public void searchByType(String type)
    {
    	System.out.println("I am from type");
    }
    public void reserved(String title,String author)
    {
    	System.out.println("I am from Reserved");
    }
    public void addBook(Book book)
    {   
    	
    	books.add(book);
    }
    public void addBook(ArrayList<Book> bk)  
    {  
    	
    	books.addAll(bk);
    }

    // Implement other methods like updateBook, removeBook, searchBookByTitle, searchBookByAuthor
    // ...

    public void saveLibraryToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(books);
            System.out.println("Library data saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving library data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadLibraryFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            books = (List<Book>) inputStream.readObject();
            System.out.println("Library data loaded from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading library data: " + e.getMessage());
        }
    }

}