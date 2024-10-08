package com.jackjtaylor.taskr.model;

public class TaskModel {

    private String taskName;
    private boolean isCompleted = false;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public TaskModel(String taskName, boolean completed) {
        super();
        this.taskName = taskName;
        this.isCompleted = completed;
    }

}
