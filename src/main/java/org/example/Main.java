package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("todo","ajfalf");
        Task task2 = new Task("next","ajfalf");
        Task task3 = new Task("next","alfjd");
        Task task4 = new Task("done","alfjd");
        task3.changeState("done");
        Task[] tasks = {task1,task2,task3,task4};
        TaskList taskList = new TaskList();
        for (Task task : tasks) {
            taskList.addTasks(task);
        }
        taskList.showFilteringTasks(State.DONE);
    }
}