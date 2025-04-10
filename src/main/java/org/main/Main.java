package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.taskmanagment.Task;
import org.taskmanagment.TaskList;


public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TaskList taskList = new TaskList();
		int option = 0;
		do {
			System.out.println("1.Insert Task\n2.View existing tasks\n3.Filtering Tasks\n4.Save Tasks\n5.Exit");
			try {
				option = Integer.parseInt(reader.readLine());
			switch (option) {
				case 1:
					System.out.println("Insert the state of Task:");
					String state = reader.readLine();
					System.out.println("Insert the task:");
					String task = reader.readLine();
					taskList.addTasks(new Task(state, task));
					break;
				case 2:
					System.out.println(taskList.showAllTasks());
					break;
				case 3:
					System.out.println("Insert the state to filter:");
					String stado = reader.readLine();
					System.out.println(taskList.showFilteringTasks(stado));
					break;
				case 4:
					System.out.println("Saving tasks...");
					taskList.saveTasks();
			}
			} catch (IOException e) {
				System.err.println("The I/O fail " + e.getMessage());
			}

		} while (option != 5);
	}
}
