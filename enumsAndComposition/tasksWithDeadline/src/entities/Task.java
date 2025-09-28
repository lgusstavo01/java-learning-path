package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import util.PriorityState;

public class Task {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String description;
	private LocalDate deadline;
	private PriorityState priority;
	
	public Task() {}

	public Task(String description, LocalDate deadline, PriorityState priority) {
		this.description = description;
		this.deadline = deadline;
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public PriorityState getPriority() {
		return priority;
	}
	
	private boolean isOverdue(LocalDate date) {
		return !LocalDate.now().isAfter(date);
	}

	@Override
	public String toString() {
		return "Description of the task: "
				+ description
				+ "\nDeadline of the task: "
				+ deadline.format(formatter)
				+ "\nPrioriy of the task: "
				+ priority
				+ "\nTask overdue: "
				+ (isOverdue(deadline) ? "In time" : "Overdue")
				+ "\n";
	}
	
	
}
