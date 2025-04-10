package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.taskmanagment.Task;
import org.taskmanagment.TaskList;


public class Main {
	public static void main(String[] args) {
		TaskList taskList = new TaskList();
		View view = new View();
		Control control = new Control(view,taskList);
		control.mainProgram();
	}
}
