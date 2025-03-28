package Library;
import Library.Books;

import java.util.*;

public class LibrarySystem {
  
	    private ArrayList<Books> book;  

	    public LibrarySystem() {  
	        this.book = new ArrayList<>();  
	    }  

	    public void addBook(String id, String title, String author, String genre, String availabilityStatus) {  
	        if (getBookById(id) == null && !title.isEmpty() && !author.isEmpty() &&  
	                (availabilityStatus.equalsIgnoreCase("Available") || availabilityStatus.equalsIgnoreCase("Checked Out"))) {  
	            book.add(new Books(id, title, author, genre, availabilityStatus));  
	            System.out.println("Book added successfully.");  
	        } else {  
	            System.out.println("Error: Book could not be added. Check uniqueness of ID and non-empty fields.");  
	        }  
	    }  

	    public Books getBookById(String id) {  
	        for (Books book : book) {  
	            if (book.getId().equals(id)) {  
	                return book;  
	            }  
	        }  
	        return null;  
	    }  

	    public void viewAllBooks() {  
	        if (book.isEmpty()) {  
	            System.out.println("No books in the library.");  
	        } else {  
	            for (Books book : book) {  
	                System.out.println(book);  
	            }  
	        }  
	    }  

	    public void updateBook(String id, String newTitle, String newAuthor, String newGenre, String newAvailabilityStatus) {  
	        Books book = getBookById(id);  
	        if (book != null) {  
	            if (!newTitle.isEmpty()) book.setTitle(newTitle);  
	            if (!newAuthor.isEmpty()) book.setAuthor(newAuthor);  
	            if (!newGenre.isEmpty()) book.setGenre(newGenre);  
	            if (newAvailabilityStatus.equalsIgnoreCase("Available") || newAvailabilityStatus.equalsIgnoreCase("Checked Out")) {  
	                book.setAvailabilityStatus(newAvailabilityStatus);  
	            }  
	            System.out.println("Book details updated successfully.");  
	        } else {  
	            System.out.println("Error: Book not found.");  
	        }  
	    }  

	    public void deleteBook(String id) {  
	        Books book = getBookById(id);  
	        if (book != null) {  
	            ((Collection<Books>) book).remove(book);  
	            System.out.println("Book removed successfully.");  
	        } else {  
	            System.out.println("Error: Book not found.");  
	        }  
	    }
}

