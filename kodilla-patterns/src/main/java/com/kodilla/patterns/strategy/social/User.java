package com.kodilla.patterns.strategy.social;

public class User {

    private String name;
    SocialPublisher socialPublisher;

    public User(String name,SocialPublisher socialPublisher){
        this.name = name;
        this.socialPublisher = socialPublisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(){
        return this.socialPublisher.share();
    }
}
