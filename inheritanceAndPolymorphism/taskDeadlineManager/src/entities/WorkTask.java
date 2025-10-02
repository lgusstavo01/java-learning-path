package entities;

import java.time.LocalDateTime;

import util.Status;

public class WorkTask extends Task {
	private String nameProject;

	public WorkTask(String description, LocalDateTime timeLimit, Status status, String nameProject) {
		super(description, timeLimit, status);
		this.nameProject = nameProject;
	}

	public String getNameProject() {
		return nameProject;
	}

	@Override
	public String toString() {
		return "Name of project: " + nameProject + "\n" + super.toString();
	}

}
