package be.odisee.code;

import java.util.ArrayList;

public class Database {

    public ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public boolean isUser(String username, String password){

    }
}
