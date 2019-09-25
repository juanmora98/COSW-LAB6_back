package com.cosw.taskPlanner.taskPanner.Pojos;


public class Task{


    //Atributos
    private String taskId;
    private String taskTitle;
    private String taskDescription;
    private User jobUser;
    private String taskStatus;
    private String DueDate;


    public Task(){
        
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public User getJobUser() {
        return jobUser;
    }

    public void setJobUser(User jobUser) {
        this.jobUser = jobUser;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    





}