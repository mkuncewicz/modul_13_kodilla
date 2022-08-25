package com.kodilla.good.patterns.challenges;

public class OrderDto  {

    private User user;
    private boolean isRented;

    public OrderDto(final User user, final boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() { return user; }

    public boolean isRented() { return isRented; }

}
