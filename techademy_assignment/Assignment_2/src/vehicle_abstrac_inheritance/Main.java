package vehicle_abstrac_inheritance;

public class Main {
	    public static void main(String[] args) {
	        // Create a Car object
	        Car car = new Car("Toyota", "Camry", 4);
	        car.accelerate();
	        car.brake();
	        
	        System.out.println();
	        
	        // Create a Motorcycle object
	        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", true);
	        motorcycle.accelerate();
	        motorcycle.brake();
	    }
	}


