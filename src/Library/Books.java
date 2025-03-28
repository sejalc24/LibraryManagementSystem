package Library;

	public class Books {  
	    private String id;  
	    private String title;  
	    private String author;  
	    private String genre;  
	    private String availabilityStatus; // "Available" or "Checked Out"  

	    public Books(String id, String title, String author, String genre, String availabilityStatus) {  
	        this.id = id;  
	        this.title = title;  
	        this.author = author;  
	        this.genre = genre;  
	        this.availabilityStatus = availabilityStatus;  
	    }  

	    // Getters and Setters  
	    public String getId() {  
	        return id;  
	    }  

	    public String getTitle() {  
	        return title;  
	    }  

	    public String getAuthor() {  
	        return author;  
	    }  

	    public String getGenre() {  
	        return genre;  
	    }  

	    public String getAvailabilityStatus() {  
	        return availabilityStatus;  
	    }  

	    public void setTitle(String title) {  
	        this.title = title;  
	    }  

	    public void setAuthor(String author) {  
	        this.author = author;  
	    }  

	    public void setGenre(String genre) {  
	        this.genre = genre;  
	    }  

	    public void setAvailabilityStatus(String availabilityStatus) {  
	        this.availabilityStatus = availabilityStatus;  
	    }  

	    @Override  
	    public String toString() {  
	        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Status: " + availabilityStatus;  
	    }
 
	}
