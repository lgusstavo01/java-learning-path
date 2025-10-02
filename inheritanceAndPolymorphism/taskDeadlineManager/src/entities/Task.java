package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import util.Status;

public class Task {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	private String description;
	private LocalDateTime timeLimit;
	private Status status;
	
	public Task(String description, LocalDateTime timeLimit, Status status) {
		this.description = description;
		this.timeLimit = timeLimit;
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public LocalDateTime getTimeLimit() {
		return timeLimit;
	}

	public Status getStatus() {
		return status;
	}
	
	public Boolean isOverdue() {
		return status == Status.PENDING && timeLimit.isBefore(LocalDateTime.now());
	}

	@Override
	public String toString() {
		return "Description task: " + description + "\nTime limit: " + timeLimit.format(fmt) + "\nStatus: " + status + "\nOverdue: " + (isOverdue() ? "True\n" : "False\n");
	}
	
	
}
