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
    public void insertNewTask() throws IOException {
        System.out.println("Insert the state of Task:");
        String state = reader.readLine();
        System.out.println("Insert the task:");
        String task = reader.readLine();
        taskList.addTasks(new Task(state, task));
        taskList.saveTasks();
    }
}
