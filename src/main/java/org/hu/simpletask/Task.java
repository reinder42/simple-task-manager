package org.hu.simpletask;

public class Task {
    private String name;

    private boolean isCompleted;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public String getName() { return name; }

    public boolean isCompleted() { return isCompleted; }

    public void setName(String name) { this.name = name; }

    public void setCompleted(boolean completed) { isCompleted = completed; }
}
