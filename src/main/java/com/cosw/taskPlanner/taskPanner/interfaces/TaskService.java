package com.cosw.taskPlanner.taskPanner.interfaces;



import java.util.List;
import com.cosw.taskPlanner.taskPanner.Pojos.User;
import com.cosw.taskPlanner.taskPanner.Pojos.Task;


public interface TaskService {
    List<Task> geTasksList();
    
    Task getTaskById(String id);
    
    List<Task> getTasksByUserId(String userId);
    
    Task assignTaskToUser(String taskId, User user);
    
    void removeTask(String taskId);
    
    Task updateTask(Task task);
}