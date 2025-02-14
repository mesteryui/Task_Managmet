package org.example;

public class Task {
    State state;
    String task;

    public Task(String state,String task) {
        this.state = State.valueOf(state.toUpperCase());
        this.task = task;
    }
    public String changeState(String newState) {
        this.state = State.valueOf(newState.toUpperCase());
        return state.toString();
    }
}
