package librarymanagement;

	abstract class LibraryMaterial {
	    // Properties
	    String title;
	    String author;
	    boolean isCheckedOut;

	    // Constructor
	    public LibraryMaterial(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isCheckedOut = false; // Initially not checked out
	    }

	    // Abstract methods
	    abstract void checkout();
	    abstract void returnMaterial();

	    // Getter method for title
	    public String getTitle() {
	        return title;
	    }

	    // Getter method for author
	    public String getAuthor() {
	        return author;
	    }

	    // Method to check if the material is checked out
	    public boolean isCheckedOut() {
	        return isCheckedOut;
	    }

	    // Setter method for isCheckedOut
	    public void setCheckedOut(boolean checkedOut) {
	        isCheckedOut = checkedOut;
	    }
	}



