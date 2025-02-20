package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    ArrayList<Task> tasks;
    public void showAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public TaskList(Task...tasks) {
        this.tasks = new ArrayList<>(List.of(tasks));
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
    public void deleteTask(Task task) {
        tasks.remove(task);
    }
}
