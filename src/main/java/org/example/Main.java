package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("todo","ajfalf");
        Task task2 = new Task("next","ajfalf");
        Task[] tasks = {task1,task2};
        TaskList taskList = new TaskList();
        for (Task task : tasks) {
            taskList.addTasks(task);
        }
        taskList.mostrarTareas();
    }
}