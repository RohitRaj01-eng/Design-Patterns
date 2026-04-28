package entities;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private final int id;
    private final String username;
    private String email;

    private static AtomicInteger ID=new AtomicInteger(1);


    public User(String username, String email) {
        this.username = username;
        this.email=email;
        this.id=ID.getAndIncrement();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.username + " is a user with email: " + this.email + " and id: " + id;
    }
}
