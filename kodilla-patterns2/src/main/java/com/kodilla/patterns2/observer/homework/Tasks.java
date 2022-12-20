package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Tasks implements ObservableTask{

    private final List<ObserverTask> observers;
    private final List<String> messages;
    private final String name;

    public Tasks(String name) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverTask observerTask) {
        observers.add(observerTask);
    }

    @Override
    public void notifyObservers() {
        for (ObserverTask observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverTask observerTask) {
        observers.remove(observerTask);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
