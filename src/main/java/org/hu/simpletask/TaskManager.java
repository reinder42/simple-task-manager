package org.hu.simpletask;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(String name) {
        Task task = new Task(name);
        tasks.add(task);
    }

    public void completeTask(int index) {
        // Implement this pls
    }

    public void removeTask(int index) {
        // Implement this pls
    }
}
