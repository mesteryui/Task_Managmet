package org.main;

import org.taskmanagment.Task;
import org.taskmanagment.TaskList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TaskList taskList = new TaskList();
        int option;
        do {
            System.out.println("1.Insert Task\n2.View existing tasks\n3.Filtering Tasks\n4.Exit");
            option = Integer.parseInt(reader.readLine());
            switch (option) {
                case 1:
                    System.out.println("Insert the state of Task:");
                    String state = reader.readLine();
                    System.out.println("Insert the task:");
                    String task = reader.readLine();
                    taskList.addTasks(new Task(state,task));
                    break;
                case 2:
                    System.out.println(taskList.showAllTasks());
                    break;
                case 3:
                    System.out.println("Insert the state to filter:");
                    String stado = reader.readLine();
                    System.out.println(taskList.showFilteringTasks(stado));
                    break;
            }


        } while (option!=4);
    }
}