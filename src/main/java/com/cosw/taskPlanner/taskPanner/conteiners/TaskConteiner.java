package com.cosw.taskPlanner.taskPanner.conteiners;

import java.util.ArrayList;
import java.util.List;
import com.cosw.taskPlanner.taskPanner.Pojos.Task;


public class TaskConteiner{

    List<Task> listTask = new ArrayList<>();
    
    public List<Task> getTaskList(){
        return listTask;
    }

    public void SaveTask(Task taskToSave){
        listTask.add(taskToSave);
    }

    public Task getTaskById(String id){
        Task returnTask = new Task();
        for (Task var : listTask) {
            if(var.getTaskId().equals(id)){
                returnTask = var;
                break;    
            }
        }
        return returnTask;
    }

    public List<Task> getTasksByUserId(String userId){
        List<Task> listUserTasks = new ArrayList<>();
        for (Task var : listTask) {
            if(var.getTaskId().equals(userId)){
                listUserTasks.add(var);
            }
        }
        return listUserTasks;
    }












}