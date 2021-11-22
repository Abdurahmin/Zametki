package com.example.zametki;

public class TaskModel {
    String title, description;

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskModel(String title, String description) {
        this.description = description;
        this.title = title;

    }
}
