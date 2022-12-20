package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Tasks java = new JavaTask();
        Tasks python = new PythonTask();
        Mentor mentor1 = new Mentor("Pawel P");
        Mentor mentor2 = new Mentor("Piotr G");
        java.registerObserver(mentor1);
        java.registerObserver(mentor2);
        python.registerObserver(mentor1);
        //When
        java.addPost("New Task");
        java.addPost("New Task");
        java.addPost("New Task");
        python.addPost("New Task");
        python.addPost("New Task");

        //Then
        assertEquals(5,mentor1.getUpdateCount());
        assertEquals(3,mentor2.getUpdateCount());
    }
}
