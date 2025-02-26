package org.taskmanagment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TaskListTest {

        private TaskList taskList;

        @BeforeEach
        public void setUp() {
            // Se inicializa la lista y se agregan 4 tareas con estado "todo"
            taskList = new TaskList();
            taskList.addTasks(new Task("todo", "Task 1"));
            taskList.addTasks(new Task("todo", "Task 2"));
            taskList.addTasks(new Task("todo", "Task 3"));
            taskList.addTasks(new Task("todo", "Task 4"));
        }

    /**

     Parameterized test that uses data in a CSV format.
     It is expected that, when deleting the task at the indicated position (taskNumber),
     the element is removed and the value of the task that remains at that position is returned.
     Examples:
     If taskNumber is 1:

     "Task 1" is removed (index 0) and the list becomes:

     ["Task 2", "Task 3", "Task 4"], returning "Task 2".

     If taskNumber is 2:

     "Task 2" is removed (index 1) and the list becomes:

     ["Task 1", "Task 3", "Task 4"], returning "Task 3".

     If taskNumber is 3:

     "Task 3" is removed (index 2) and the list becomes:

     ["Task 1", "Task 2", "Task 4"], returning "Task 4".

     */
        @ParameterizedTest
        @CsvSource({
                "1,Task 1",
                "2,Task 2",
                "3,Task 3",
                "4,Task 4"
        })
        public void testDeleteTask(int taskNumber, String expectedTask) {
            String result = taskList.deleteTask(taskNumber);
            assertEquals(expectedTask, result);
        }
    }
