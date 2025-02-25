package org.main;

import org.taskmanagment.Task;
import org.taskmanagment.TaskList;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskList taskList = new TaskList();
        int opcion;
        do {
            System.out.println("1.Introducir tarea\n2.Ver tareas existentes\n3.Tareas por filtro\n4.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca estado de la tarea:");
                    String estado = sc.next();
                    System.out.println("Introduzca la tarea:");
                    String tarea = sc.next();
                    taskList.addTasks(new Task(estado,tarea));
                    break;
                case 2:
                    System.out.println(taskList.showAllTasks());
                    break;
                case 3:
                    System.out.println("Introduca el estado por el que quiere filtrar");
                    String stado = sc.next();
                    System.out.println(taskList.showFilteringTasks(stado));
            }


        } while (opcion!=4);
        sc.close();
    }
}