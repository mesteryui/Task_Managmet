package org.main;

import org.taskmanagment.Task;
import org.taskmanagment.TaskList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Control {
    View view;
    TaskList taskList;
    BufferedReader reader;

    public Control(View view, TaskList taskList) {
        this.view = view;
        this.taskList = taskList;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void mainProgram() {
        view.mainMenu(taskList,this);
    }

    public void insertNewTask() {
        try {
            System.out.println("Insert the state of Task:");
            String state = reader.readLine();
            System.out.println("Insert the task:");
            String task = reader.readLine();
            taskList.addTasks(new Task(state, task));
            taskList.saveTasks();
        } catch (IOException e) {
            System.err.println("There's an I/O Error " + e.getMessage());
        }
    }
    public void editTaskState() {
        try {
        System.out.println("Insert the state to filter:");
        String stado = reader.readLine();
        System.out.println(taskList.showFilteringTasks(stado));
        taskList.saveTasks();
        } catch (IOException e) {
            System.err.println("There's an I/O fail " + e.getMessage());
        }
    }

}
