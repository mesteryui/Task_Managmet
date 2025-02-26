package org.taskmanagment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task1 = new Task("todo","Hacer huevos");
    @ParameterizedTest(name="Changes to {0}")
    @CsvSource({
            "NEXT,NEXT",
            "DONE,DONE",
            "TODO,TODO",
            "NexT,NEXT","tODo,TODO","DonE,DONE"})
    void changeState(String state,String expected) {
        assertEquals(expected,task1.changeState(state));
    }

}