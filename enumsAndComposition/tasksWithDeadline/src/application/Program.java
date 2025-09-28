package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Task;
import util.PriorityState;

public class Program {

	public static void main(String[] args) {
		List<Task> taskList = new ArrayList<>();

		taskList.add(new Task("Read a book", LocalDate.of(2025, 10, 1), PriorityState.MEDIUM));
		taskList.add(new Task("Deliver the work", LocalDate.of(2025, 9, 10), PriorityState.HIGH));
		taskList.add(new Task("Watch the game", LocalDate.of(2025, 9, 15), PriorityState.LOW));

		for (Task task : taskList) {
			System.out.println(task);
		}
	}
}
