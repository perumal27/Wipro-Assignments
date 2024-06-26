package librarymanagement;

	public class Main {
	    public static void main(String[] args) {
	        // Create a library system
	        LibrarySystem library = new LibrarySystem();

	        // Add materials to the library
	        Book book = new Book("thirukural", "thiruvalluvar", 400);
	        Magazine magazine = new Magazine("generalscience", "Various Authors", 123);
	        Audiobook audiobook = new Audiobook("The Great Gatsby", "F. Scott Fitzgerald", "Jake Gyllenhaal");
	        library.addMaterial(book);
	        library.addMaterial(magazine);
	        library.addMaterial(audiobook);

	        // Display available materials
	        library.displayAvailableMaterials();

	        // Test checkout and return
	        library.checkoutMaterial(book);
	        library.checkoutMaterial(magazine);
	        library.displayAvailableMaterials();

	        library.returnMaterial(book);
	        library.displayAvailableMaterials();
	    }
	}



