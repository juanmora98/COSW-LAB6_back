package com.cosw.taskPlanner.taskPanner.interfaces;

import java.util.List;
import com.cosw.taskPlanner.taskPanner.Pojos.User;


public interface UserService {

    List<User> getUsersList();
    
    User getUserById(String userId);
    
    User createUser(User user);
    
    User updateUser(User user);
    
    void removeUser(String userId);

}