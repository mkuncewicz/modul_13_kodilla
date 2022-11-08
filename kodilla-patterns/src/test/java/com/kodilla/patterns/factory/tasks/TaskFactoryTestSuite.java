
package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(taskFactory.DRIVINGTASK);
        boolean testDoTest1 = driving.isTaskExecuted();
        driving.executeTask();
        boolean testDoTest2 = driving.isTaskExecuted();
        //Then
        Assertions.assertEquals("DrivingTest",driving.getTaskName());
        Assertions.assertFalse(testDoTest1);
        Assertions.assertTrue(testDoTest2);
    }
    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(taskFactory.PAINTINGTASK);
        boolean testDoTest1 = painting.isTaskExecuted();
        painting.executeTask();
        boolean testDoTest2 = painting.isTaskExecuted();
        //Then
        Assertions.assertEquals("PaintingTest",painting.getTaskName());
        Assertions.assertFalse(testDoTest1);
        Assertions.assertTrue(testDoTest2);
    }
    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(taskFactory.SHOPPINGTASK);
        boolean testDoTest1 = shopping.isTaskExecuted();
        shopping.executeTask();
        boolean testDoTest2 = shopping.isTaskExecuted();
        //Then
        Assertions.assertEquals("ShoppingTest",shopping.getTaskName());
        Assertions.assertFalse(testDoTest1);
        Assertions.assertTrue(testDoTest2);
    }
}
