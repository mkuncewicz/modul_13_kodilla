package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public Task makeTask(String taskClass){
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("DrivingTest","Poznan","Car");
            case PAINTINGTASK:
                return new PaintingTask("PaintingTest","Black","Image");
            case SHOPPINGTASK:
                return new ShoppingTask("ShoppingTest","Computer",2);
            default:
                return null;
        }
    }

}
