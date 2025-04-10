package org.main;

import org.taskmanagment.Task;
import org.taskmanagment.TaskList;

import java.io.BufferedReader;
import java.io.IOException;

public class View {
    public void mainMenu(TaskList taskList, Control control) {
        int option = 0;
        do {
            BufferedReader reader = control.reader;
            System.out.println("1.Insert Task\n2.View existing tasks\n3.Filtering Tasks\n4.Delete Task\n5.Modify task\n6.Exit");
            try {
                option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        control.insertNewTask();
                        break;
                    case 2:
                        System.out.println(taskList.showAllTasks());
                        break;
                    case 3:
                        System.out.println("Insert the state to filter:");
                        String stado = reader.readLine();
                        System.out.println(taskList.showFilteringTasks(stado));
                        taskList.saveTasks();
                        break;
                    case 4:
                        System.out.println("Insert the task to delete:");
                        String task2 = reader.readLine();
                        if (taskList.existsTask(task2)) {
                            taskList.tasks.remove(taskList.obtainTask(task2));
                        }
                        taskList.saveTasks();
                        break;
                    case 5:
                        System.out.println("Insert the task that you want to edit");
                        String taskEdit = reader.readLine();
                        if (taskList.existsTask(taskEdit)) {
                            Task taskToEdit = taskList.obtainTask(taskEdit);
                            System.out.println("What do you want to edit:\n1.State\n2.Task");
                            var opt = reader.read();
                            switch (opt) {
                                case 1 -> {
                                    System.out.println("Insert the new state:");
                                    var newState = reader.readLine();
                                    taskToEdit.setState(newState);
                                }
                                case 2 -> {
                                    System.out.println("Insert the new task body:");
                                    var newBody = reader.readLine();
                                    taskToEdit.setTask(newBody);
                                }
                            }
                        }

                }
            } catch (IOException e) {
                System.err.println("The I/O fail " + e.getMessage());
            }

        } while (option != 5);
    }
}
