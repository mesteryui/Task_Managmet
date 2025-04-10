package org.taskmanagment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * List of tasks that can be recorded in a file or obtanied from a file
 * @author Oscar (username:Mester)
 * @version 1.0
 * **/
public class TaskList {
    public ArrayList<Task> tasks;
    public String showAllTasks() {
        String acabado="";
        for (int i = 0;i<tasks.size();i++) {
             acabado += i+1 + "." + tasks.get(i)+"\n";
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
        tasks = scanTasks();
        if (tasks==null) {
            tasks = new ArrayList<>();
        }
    }
    public String addTasks(Task task) {
        tasks.add(task);
        return task.getTask();
    }
    public ArrayList<Task> scanTasks() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(".tasks"));
            return (ArrayList<Task>) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("There aren't files");
        } catch (ClassNotFoundException e) {
            System.out.println("The class doesn't exist");
        } finally {
            if (objectInputStream!=null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    System.out.println("The file can't close "+ e.getMessage());
                }
            }
        }
        return new ArrayList<Task>();
    }
    public void saveTasks() {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(".tasks"));
            objectOutputStream.writeObject(tasks);
        } catch (IOException e) {
            System.out.println("There aren't files");
        } finally {
            if (objectOutputStream!=null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    System.out.println("The file can't close "+ e.getMessage());
                }
            }
        }
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
    public Task obtainTask(String task) {
        for (Task value : tasks) {
            if (value.getTask().equals(task)) return value;
        }
        return null;
    }
    public boolean existsTask(String task) {
        for (Task value : tasks) {
            if (value.getTask().equals(task)) return true;
        }
        return false;
    }
    public boolean existsTask(Task task) {
        return tasks.contains(task);
    }
}
