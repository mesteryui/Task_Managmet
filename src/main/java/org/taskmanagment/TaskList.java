package org.taskmanagment;

import java.util.ArrayList;
import java.util.List;
/**
 * List of tasks that can be recorded in a file or obtanied from a file
 * @author Oscar (username:Mester)
 * @version 1.0
 * **/
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
    public String showFilteringTasks(String state) {
        String finalD="";
        for (int i = 0;i<tasks.size();i++) {
            if (tasks.get(i).getState() == State.valueOf(state.toUpperCase())) {
                finalD += i+1 + "." +tasks.get(i);
            }
        }
        return finalD;
    }

    public TaskList() {
        tasks = new ArrayList<>();
    }
    public void addTasks(Task task) {
        tasks.add(task);
    }
    public ArrayList<Task> scanTasks() {
       return new ArrayList<>();
    }
    public void saveTasks() {

    }
    /**
     * Delete the tasks in the TaskList
     * @param taskNumber the tasknumber
     */
    public void deleteTask(int taskNumber) {
        tasks.remove(tasks.get(taskNumber-1));
    }
    public void setTaskStatus(String status,int index) {
        tasks.get(index).setState(status);
    }
}
