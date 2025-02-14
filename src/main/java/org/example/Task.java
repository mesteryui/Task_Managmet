package org.example;

/**
 * Definition of a task with its state and the name of task
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Task {
    State state;
    String task;

    /**
     * Creation of a task
     * @param state the state of a task
     * @param task the task itself
     */
    public Task(String state,String task) {
        this.state = State.valueOf(state.toUpperCase());
        this.task = task;
    }
    public String changeState(String newState) {
        this.state = State.valueOf(newState.toUpperCase());
        return state.toString();
    }
}
