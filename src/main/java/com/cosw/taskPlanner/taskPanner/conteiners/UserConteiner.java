package com.cosw.taskPlanner.taskPanner.conteiners;

import java.util.ArrayList;
import java.util.List;
import com.cosw.taskPlanner.taskPanner.Pojos.User;


public class UserConteiner{

    List<User> listUsers = new ArrayList<>();

    public List<User> getUsersList() {
        
        return listUsers;
    }

    public User getUserById(String userId) {
        User usuarioARetornar = new User();
        for (User var : listUsers) {
            if(var.getUserId().equals(userId)){
                usuarioARetornar = var;
                break;
            }
        }
        return usuarioARetornar;
    }

}
