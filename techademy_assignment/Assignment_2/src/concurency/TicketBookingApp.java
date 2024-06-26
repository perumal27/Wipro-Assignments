package concurency;

public class TicketBookingApp {
	public static void main(String[] args) {
		 // Create array of no of event objects
		 TicketBookingSystem bookingSystem = new TicketBookingSystem(events);
		 // Simulate multiple users trying to book tickets simultaneously
		 Thread user1 = new Thread(() -> {
		 bookingSystem.bookTickets("Concert", 2);
		 });
		 Thread user2 = new Thread(() -> {
		 bookingSystem.bookTickets("Conference", 5);
		 });
		 Thread user3 = new Thread(() -> {
		 bookingSystem.bookTickets("Workshop", 3);
		 });
		// Start each thread
		 // Display available tickets
		 bookingSystem.displayAvailableTickets();
		 }
}

