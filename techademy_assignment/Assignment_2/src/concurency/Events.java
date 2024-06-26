package concurency;

	import java.util.concurrent.locks.Lock;
	import java.util.concurrent.locks.ReentrantLock;
	class Events {
	 private String eventName;
	 private int availableTickets;
	 private Lock lock;

	 public Event(String eventName, int availableTickets) {
	 this.eventName = eventName;
	 this.availableTickets = availableTickets;
	 this.lock = new ReentrantLock();
	 }
	//Create Getter/Setter
	 public boolean bookTickets(int numTickets) {
	 lock.lock();
	 try {
	// if available tickets are less than numTickets , update the available tickets and return true 
	//else false
	 } finally {
	 lock.unlock();
	 }
	 }
	}



