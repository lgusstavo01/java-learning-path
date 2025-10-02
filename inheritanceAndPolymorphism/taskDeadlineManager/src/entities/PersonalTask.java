package entities;

import java.time.LocalDateTime;

import util.Status;

public class PersonalTask extends Task {
	private Integer priority;

	public PersonalTask(String description, LocalDateTime timeLimit, Status status, Integer priority) {
		super(description, timeLimit, status);
		this.priority = priority;
	}

	public Integer getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "PersonalTask - Prority: " + priority + "\n" + super.toString();
	}

}
