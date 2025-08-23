package com.example.myapplication;

public abstract class User {
    private String editTextUserName;
    private String editTextUserId;

    public User(String name, String userId) {
        this.editTextUserName = name;
        this.editTextUserId = userId;
    }

    // Encapsulation
    public String getName() {
        return editTextUserName;
    }

    public void setName(String name) {
        this.editTextUserName = name;
    }

    public String getUserId() {
        return editTextUserId;
    }

    public void setUserId(String userId) {
        this.editTextUserId = userId;
    }

    // Abstraction
    public abstract void showInfo();
}
