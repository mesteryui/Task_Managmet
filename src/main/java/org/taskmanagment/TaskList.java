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
    public String showAllTasks() {
        String acabado="";
        for (int i = 0;i<tasks.size();i++) {
            if (i<tasks.size()-1) acabado += i+1 + "." + tasks.get(i);
            else acabado += i+1 + "." + tasks.get(i)+"\n";
        }
        return acabado;
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
                finalD += i+1 + "." +tasks.get(i)+"\n";
            }
        }
        return finalD;
    }

    public TaskList() {
        tasks = new ArrayList<>();
    }
    public String addTasks(Task task) {
        tasks.add(task);
        return task.getTask();
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
    public String deleteTask(int taskNumber) {
        String result = tasks.get(taskNumber-1).getTask();
        tasks.remove(tasks.get(taskNumber-1));
        return result;
    }
    public void setTaskStatus(String status,int index) {
        tasks.get(index).setState(status);
    }
}
