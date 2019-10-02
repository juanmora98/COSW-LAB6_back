package com.cosw.taskPlanner.taskPanner.interfaces.impl;


import java.util.List;
import com.cosw.taskPlanner.taskPanner.Pojos.User;
import com.cosw.taskPlanner.taskPanner.conteiners.TaskConteiner;
import com.cosw.taskPlanner.taskPanner.interfaces.TaskService;
import com.cosw.taskPlanner.taskPanner.Pojos.Task;


public class TaskServiceImpl implements TaskService {

    TaskConteiner taskContainer;
    
    @Override
    public List<Task> geTasksList(){
        return taskContainer.getTaskList();
    }
    
    @Override
    public Task getTaskById(String id){
        Task entregable = taskContainer.getTaskById(id);
        return entregable;
    }
    
    @Override
    public List<Task> getTasksByUserId(String userId){
        List<Task> entregable = taskContainer.getTasksByUserId(userId);
        return entregable;
    }
    
    @Override
    public Task assignTaskToUser(String taskId, User user){
        List<Task> listaTask = taskContainer.getTaskList();
        Task entregable = new Task();
        for (Task var : listaTask) {
            if (var.getTaskId().equals(taskId)){
                var.setJobUser(user);
                entregable = var;
            }
        };
        return entregable;
    }
    
    @Override
    public void removeTask(String taskId){
        List<Task> listaTask = taskContainer.getTaskList();
        for (Task var : listaTask) {
            if (var.getTaskId().equals(taskId)){
                listaTask.remove(var);
            }
        };
    }
    
    @Override
    public Task updateTask(Task task){
        List<Task> listaTask = taskContainer.getTaskList();
        for (Task var : listaTask) {
            if (var.getTaskId().equals(task.getTaskId())){
                listaTask.remove(var);
                listaTask.add(task);
            }
        };
        return task;
    }
}