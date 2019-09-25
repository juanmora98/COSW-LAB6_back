package com.cosw.taskPlanner.taskPanner.interfaces.impl;



import java.util.List;
import com.cosw.taskPlanner.taskPanner.Pojos.User;
import com.cosw.taskPlanner.taskPanner.interfaces.TaskService;
import com.cosw.taskPlanner.taskPanner.Pojos.Task;


public class TaskServiceImpl implements TaskService {
    
    
    @Override
    public List<Task> geTasksList(){
        return null;
    }
    
    @Override
    public Task getTaskById(String id){
        return null;
    }
    
    @Override
    public List<Task> getTasksByUserId(String userId){
        return null;
    }
    
    @Override
    public Task assignTaskToUser(String taskId, User user){
        return null;
    }
    
    @Override
    public void removeTask(String taskId){

    }
    
    @Override
    public Task updateTask(Task task){
        return null;
    }
}