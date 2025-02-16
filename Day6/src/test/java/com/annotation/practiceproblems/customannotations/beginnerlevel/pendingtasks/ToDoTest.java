package com.annotation.practiceproblems.customannotations.beginnerlevel.pendingtasks;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Method;

public class ToDoTest extends TestCase {
    @Test
    public void testUserAuthenticationTask() throws Exception {
        Method method = ProjectTasks.class.getDeclaredMethod("userAuthentication");
        Todo annotation = method.getAnnotation(Todo.class);

        assertNotNull(annotation); //Checking annotation presence
        assertEquals("Implement user authentication", annotation.task()); //Checking task description
        assertEquals("Saurabh", annotation.assignedTo()); //Checking assigned developer
        assertEquals("HIGH", annotation.priority()); //Checking priority level
    }

    @Test
    public void testOptimizeDatabaseTask() throws Exception {
        Method method = ProjectTasks.class.getDeclaredMethod("optimizeDatabase");
        Todo annotation = method.getAnnotation(Todo.class);

        assertNotNull(annotation);
        assertEquals("Optimize database queries", annotation.task()); //Checking task description
        assertEquals("Rohit", annotation.assignedTo()); //Checking assigned developer
        assertEquals("MEDIUM", annotation.priority()); //Checking default priority
    }
}