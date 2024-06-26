package vehicle_abstrac_inheritance;

	abstract class Vehicle {
	    // Properties
	    String make;
	    String model;
	    
	    // Constructor
	    public Vehicle(String make, String model) {
	        this.make = make;
	        this.model = model;
	    }
	    
	    // Abstract methods
	    abstract void accelerate();
	    abstract void brake();
	}


