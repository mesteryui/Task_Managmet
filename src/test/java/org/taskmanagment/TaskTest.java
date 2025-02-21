package org.taskmanagment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task1 = new Task("todo","Hacer huevos");

    @Test
    @DisplayName("Cambiar a NEXT")
    void changeState() {
        assertEquals("NEXT",task1.changeState("NEXT"));
    }
    @Test
    @DisplayName("Cambiar a DONE")
    void changeState1() {
        assertEquals("DONE",task1.changeState("done"));
    }
    @Test
    @DisplayName("Cambiar a TODO")
    void changeState2() {
        assertEquals("TODO",task1.changeState("todo"));
    }

}