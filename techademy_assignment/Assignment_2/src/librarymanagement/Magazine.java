package librarymanagement;

	class Magazine extends LibraryMaterial {
	    // Additional property
	    int issueNumber;

	    // Constructor
	    public Magazine(String title, String author, int issueNumber) {
	        super(title, author);
	        this.issueNumber = issueNumber;
	    }

	    // Implementing abstract methods
	    @Override
	    void checkout() {
	        System.out.println("Magazine '" + title + "' Issue #" + issueNumber + " has been checked out.");
	        setCheckedOut(true);
	    }

	    @Override
	    void returnMaterial() {
	        System.out.println("Magazine '" + title + "' Issue #" + issueNumber + " has been returned.");
	        setCheckedOut(false);
	    }
	}


