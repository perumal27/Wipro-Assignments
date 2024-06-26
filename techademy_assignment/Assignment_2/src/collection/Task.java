package collection;
	import java.time.LocalDate;
	public class Task {
	 private String title;
	 private String description;
	 private LocalDate dueDate;
	 private int priority;
	 public Task(String title, String description, LocalDate dueDate, int priority) {
	 this.title = title;
	 this.description = description;
	 this.dueDate = dueDate;
	 this.priority = priority;
	 }
	}
	