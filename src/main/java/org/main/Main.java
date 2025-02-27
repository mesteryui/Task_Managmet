package org.main;

import org.taskmanagment.Task;
import org.taskmanagment.TaskList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskList taskList = new TaskList();
        int option;
        do {
            System.out.println("1.Insert Task\n2.View existing tasks\n3.Filtering Tasks\n4.Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Insert the state of Task:");
                    String state = sc.next();
                    System.out.println("Insert the task:");
                    String task = sc.next();
                    taskList.addTasks(new Task(state,task));
                    break;
                case 2:
                    System.out.println(taskList.showAllTasks());
                    break;
                case 3:
                    System.out.println("Insert the state to filter:");
                    String stado = sc.next();
                    System.out.println(taskList.showFilteringTasks(stado));
                    break;
            }


        } while (option!=4);
        sc.close();
    }
}