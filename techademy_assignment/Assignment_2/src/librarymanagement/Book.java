package librarymanagement;

	class Book extends LibraryMaterial {
	    // Additional property
	    int numberOfPages;

	    // Constructor
	    public Book(String title, String author, int numberOfPages) {
	        super(title, author);
	        this.numberOfPages = numberOfPages;
	    }

	    // Implementing abstract methods
	    @Override
	    void checkout() {
	        System.out.println("Book '" + title + "' by " + author + " has been checked out.");
	        setCheckedOut(true);
	    }

	    @Override
	    void returnMaterial() {
	        System.out.println("Book '" + title + "' by " + author + " has been returned.");
	        setCheckedOut(false);
	    }
	}



