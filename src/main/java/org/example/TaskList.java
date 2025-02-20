package org.example;

import java.util.ArrayList;

public class TaskList {
    ArrayList<Task> tasks;
    public void mostrarTareas() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public void showFilteringTasks(State state) {
        for (Task task : tasks) {
            if (task.getState() == state) {
                System.out.println(task);
            }
        }
    }
    public TaskList() {
        tasks = new ArrayList<>();
    }
    public void addTasks(Task task) {
        tasks.add(task);
    }
    public String ScanTasks() {
        return "";
    }
    public boolean deleteTask() {
        return false;
    }
}
