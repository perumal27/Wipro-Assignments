package vehicle_abstrac_inheritance;

	class Car extends Vehicle {
	    // Additional property
	    int numOfDoors;
	    
	    // Constructor
	    public Car(String make, String model, int numOfDoors) {
	        super(make, model);
	        this.numOfDoors = numOfDoors;
	    }
	    
	    // Implementing abstract methods
	    @Override
	    void accelerate() {
	        System.out.println("Car " + make + " " + model + " is accelerating.");
	    }
	    
	    @Override
	    void brake() {
	        System.out.println("Car " + make + " " + model + " is applying brakes.");
	    }
	}

