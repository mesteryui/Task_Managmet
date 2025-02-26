package org.taskmanagment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

    public class TaskListTest {

        private TaskList taskList;

        @BeforeEach
        public void setUp() {
            // Se inicializa la lista y se agregan 4 tareas con estado "todo"
            taskList = new TaskList();
            taskList.addTasks(new Task("todo", "Tarea 1"));
            taskList.addTasks(new Task("todo", "Tarea 2"));
            taskList.addTasks(new Task("todo", "Tarea 3"));
            taskList.addTask(new Task("todo", "Tarea 4"));
        }

        /**
         * Test parametrizado que utiliza datos de un archivo CSV.
         *
         * Se espera que, al eliminar la tarea en la posición indicada (taskNumber),
         * se elimine el elemento y se retorne el valor de la tarea que queda en esa posición.
         *
         * Ejemplos:
         * - Si taskNumber es 1:
         *     Se elimina "Tarea 1" (índice 0) y la lista queda:
         *     ["Tarea 2", "Tarea 3", "Tarea 4"], retornando "Tarea 2".
         *
         * - Si taskNumber es 2:
         *     Se elimina "Tarea 2" (índice 1) y la lista queda:
         *     ["Tarea 1", "Tarea 3", "Tarea 4"], retornando "Tarea 3".
         *
         * - Si taskNumber es 3:
         *     Se elimina "Tarea 3" (índice 2) y la lista queda:
         *     ["Tarea 1", "Tarea 2", "Tarea 4"], retornando "Tarea 4".
         */
        @ParameterizedTest
        @CsvFileSource(resources = "/deleteTaskData.csv", numLinesToSkip = 1)
        public void testDeleteTask(int taskNumber, String expectedTask) {
            String result = taskList.deleteTask(taskNumber);
            assertEquals(expectedTask, result);
        }
    }

}
