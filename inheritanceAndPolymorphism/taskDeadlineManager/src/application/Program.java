package application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.PersonalTask;
import entities.Task;
import entities.WorkTask;
import util.Status;

public class Program {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        // Creating an overdue WorkTask
        tasks.add(new WorkTask(
                "Refactor payment module",
                LocalDateTime.of(2025, 9, 25, 14, 0),
                Status.PENDING,
                "Alpha Project"
        ));

        // Creating a completed WorkTask
        tasks.add(new WorkTask(
                "Client meeting",
                LocalDateTime.of(2025, 9, 28, 10, 30),
                Status.DONE,
                "Beta Project"
        ));

        // Creating a pending PersonalTask
        tasks.add(new PersonalTask(
                "Go to the dentist",
                LocalDateTime.of(2025, 10, 2, 9, 0),
                Status.PENDING,
                3
        ));

        // Creating a canceled PersonalTask
        tasks.add(new PersonalTask(
                "Buy birthday gift",
                LocalDateTime.of(2025, 9, 30, 18, 0),
                Status.CANCELED,
                2
        ));

        // Task report
        System.out.println("=== TASK REPORT ===");
        for (Task t : tasks) {
            System.out.println("----------------------------");
            System.out.println(t.toString());
        }
    }
}
