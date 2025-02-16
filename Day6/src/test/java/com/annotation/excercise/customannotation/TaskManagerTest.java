package com.annotation.excercise.customannotation;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Method;

public class TaskManagerTest extends TestCase {
    @Test
    public void testTaskInfoAnnotation() throws Exception {
        Method method = TaskManager.class.getMethod("completeTask"); // get method
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class); // get annotation

        assertNotNull(taskInfo); // check not null
        assertEquals("High", taskInfo.priority()); // check priority
        assertEquals("Rishika", taskInfo.assignedTo()); // check assignedTo
    }
}