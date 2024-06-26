package vehicle_abstrac_inheritance;

	class Motorcycle extends Vehicle {
	    // Additional property
	    boolean hasFairing;
	    
	    // Constructor
	    public Motorcycle(String make, String model, boolean hasFairing) {
	        super(make, model);
	        this.hasFairing = hasFairing;
	    }
	    
	    // Implementing abstract methods
	    @Override
	    void accelerate() {
	        System.out.println("Motorcycle " + make + " " + model + " is accelerating.");
	    }
	    
	    @Override
	    void brake() {
	        System.out.println("Motorcycle " + make + " " + model + " is applying brakes.");
	    }
	}


