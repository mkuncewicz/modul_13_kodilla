package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverTask {

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Tasks programmingLanguage) {
        System.out.println(username + ": New messages in topic " + programmingLanguage.getName() + "\n" +
                " (total: " + programmingLanguage.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
