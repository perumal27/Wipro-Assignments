package librarymanagement;

	class Audiobook extends LibraryMaterial {
	    // Additional property
	    String narrator;

	    // Constructor
	    public Audiobook(String title, String author, String narrator) {
	        super(title, author);
	        this.narrator = narrator;
	    }

	    // Implementing abstract methods
	    @Override
	    void checkout() {
	        System.out.println("Audiobook '" + title + "' by " + author + " narrated by " + narrator + " has been checked out.");
	        setCheckedOut(true);
	    }

	    @Override
	    void returnMaterial() {
	        System.out.println("Audiobook '" + title + "' by " + author + " narrated by " + narrator + " has been returned.");
	        setCheckedOut(false);
	    }
	}



