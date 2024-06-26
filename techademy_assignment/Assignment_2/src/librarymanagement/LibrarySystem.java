package librarymanagement;

	import java.util.ArrayList;
	import java.util.List;

	public class LibrarySystem {
	    private List<LibraryMaterial> availableMaterials;

	    // Constructor
	    public LibrarySystem() {
	        this.availableMaterials = new ArrayList<>();
	    }

	    // Method to add materials to the library
	    public void addMaterial(LibraryMaterial material) {
	        availableMaterials.add(material);
	    }

	    // Method to display available materials
	    public void displayAvailableMaterials() {
	        System.out.println("Available Materials in Library:");
	        for (LibraryMaterial material : availableMaterials) {
	            System.out.println("- " + material.getTitle() + " by " + material.getAuthor() +
	                    (material.isCheckedOut() ? " (Checked Out)" : ""));
	        }
	        System.out.println();
	    }

	    // Method to checkout a material
	    public void checkoutMaterial(LibraryMaterial material) {
	        if (!material.isCheckedOut()) {
	            material.checkout();
	        } else {
	            System.out.println("Sorry, " + material.getTitle() + " is already checked out.");
	        }
	    }

	    // Method to return a material
	    public void returnMaterial(LibraryMaterial material) {
	        if (material.isCheckedOut()) {
	            material.returnMaterial();
	        } else {
	            System.out.println("This " + material.getTitle() + " was not checked out.");
	        }
	    }
	}


