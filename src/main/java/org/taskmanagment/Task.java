package org.taskmanagment;

/**
 * Definition of a task with its state and the name of task
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Task {
    private State state;
    private String task;

    public State getState() {
        return state;
    }
    public String toString() {
        return state + " " + task;
    }
    public void setState(String state) {
        this.state = State.valueOf(state.toUpperCase());
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Creation of a task
     * @param state the state of a task
     * @param task the task itself
     */
    public Task(String state,String task) {
        setState(state);
        this.task = task;
    }

    /**
     * Change the state of a task
     * @param newState the new state
     * @return the new state
     */
    public String changeState(String newState) {
        setState(newState);
        return state.toString();
    }
}
