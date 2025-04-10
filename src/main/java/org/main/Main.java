package org.main;

import org.taskmanagment.TaskList;


public class Main {
	public static void main(String[] args) {
		TaskList taskList = new TaskList();
		View view = new View();
		Control control = new Control(view,taskList);
		control.mainProgram();
	}
}
