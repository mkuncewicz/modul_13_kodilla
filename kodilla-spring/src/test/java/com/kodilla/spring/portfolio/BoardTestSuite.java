package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Do roboty");
        board.getInProgressList().getTasks().add("W trakcie");
        board.getDoneList().getTasks().add("Zrobione");
        //Then
        assertEquals("Do roboty",board.getToDoList().getTasks().get(0));
        assertEquals("W trakcie",board.getInProgressList().getTasks().get(0));
        assertEquals("Zrobione",board.getDoneList().getTasks().get(0));

    }
}
