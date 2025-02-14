package org.example;

public class Task {
    State state;
    String task;

    public Task(String state,String task) {
        this.state = this.state.valueOf(state.toUpperCase());
        this.task = task;
    }
}
