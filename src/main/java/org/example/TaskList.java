package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    ArrayList<Task> tasks;
    public void showAllTasks() {
        for (int i = 0;i<tasks.size();i++) {
            System.out.println(i+1 + "." + tasks.get(i));
        }
    }
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public TaskList(Task...tasks) {
        this.tasks = new ArrayList<>(List.of(tasks));
    }
    public void showFilteringTasks(State state) {
        for (int i = 0;i<tasks.size();i++) {
            if (tasks.get(i).getState() == state) {

                System.out.println(i+1 + "." + " " +tasks.get(i));
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

    /**
     * Delete the tasks in the TaskList
     * @param taskNumber the tasknumber
     */
    public void deleteTask(int taskNumber) {
        tasks.remove(tasks.get(taskNumber-1));
    }
}
