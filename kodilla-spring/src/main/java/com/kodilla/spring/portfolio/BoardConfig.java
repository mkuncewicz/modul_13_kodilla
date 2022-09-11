package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("task1")
    TaskList toDoList;

    @Autowired
    @Qualifier("task2")
    TaskList inProgressList;

    @Autowired
    @Qualifier("task3")
    TaskList doneList;

    @Bean
    public Board getBoard(){
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "task1")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "task2")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "task3")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
