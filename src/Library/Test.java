package Library;
import java.util.Scanner;  
import Library.LibrarySystem;

public class Test {
	
	   private static LibrarySystem library = new LibrarySystem();  

	   public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	        String choice;  

	        do {  
	            System.out.println("\nLibrary Management System");  
	            System.out.println("1. Add Book");  
	            System.out.println("2. View All Books");  
	            System.out.println("3. Search Book by ID or Title");  
	            System.out.println("4. Update Book Details");  
	            System.out.println("5. Delete a Book Record");  
	            System.out.println("0. Exit");  
	            System.out.print("Enter your choice: ");  
	            choice = scanner.nextLine();  

	            switch (choice) {  
	                case "1":  
	                    addBook(scanner);  
	                    break;  
	                case "2":  
	                    library.viewAllBooks();  
	                    break;  
	                case "3":  
	                    searchBook(scanner);  
	                    break;  
	                case "4":  
	                    updateBook(scanner);  
	                    break;  
	                case "5":  
	                    deleteBook(scanner);  
	                    break;  
	                case "0":  
	                    System.out.println("Exiting the program.");  
	                    break;  
	                default:  
	                    System.out.println("Invalid choice. Please try again.");  
	            }  
	        } while (!choice.equals("0"));  
	        scanner.close();  
	    }  

	    private static void addBook(Scanner scanner) {  
	        System.out.print("Enter Book ID: ");  
	        String id = scanner.nextLine();  
	        System.out.print("Enter Title: ");  
	        String title = scanner.nextLine();  
	        System.out.print("Enter Author: ");  
	        String author = scanner.nextLine();  
	        System.out.print("Enter Genre: ");  
	        String genre = scanner.nextLine();  
	        System.out.print("Enter Availability Status (Available/Checked Out): ");  
	        String availabilityStatus = scanner.nextLine();  
	        library.addBook(id, title, author, genre, availabilityStatus);  
	    }  

	    private static void searchBook(Scanner scanner) {  
	        System.out.print("Enter Book ID or Title to search: ");  
	        String query = scanner.nextLine();  
	        Books book = library.getBookById(query);  
	        if (book != null) {  
	            System.out.println(book);  
	        } else {  
	            System.out.println("Book not found. Please check the ID or Title.");  
	        }  
	    }  

	    private static void updateBook(Scanner scanner) {  
	        System.out.print("Enter Book ID to update: ");  
	        String id = scanner.nextLine();  
	        System.out.print("Enter new Title (or press enter to keep current): ");  
	        String newTitle = scanner.nextLine();  
	        System.out.print("Enter new Author (or press enter to keep current): ");  
	        String newAuthor = scanner.nextLine();  
	        System.out.print("Enter new Genre (or press enter to keep current): ");  
	        String newGenre = scanner.nextLine();  
	        System.out.print("Enter new Availability Status (Available/Checked Out, or press enter to keep current): ");  
	        String newAvailabilityStatus = scanner.nextLine();  
	        library.updateBook(id, newTitle, newAuthor, newGenre, newAvailabilityStatus);  
	    }  

	    private static void deleteBook(Scanner scanner) {  
	        System.out.print("Enter Book ID to delete: ");  
	        String id = scanner.nextLine();  
	        library.deleteBook(id);  
	    }  
	}

