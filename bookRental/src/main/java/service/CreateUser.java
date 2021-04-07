package service;

import repository.UserRepo;
import user.User;

public class CreateUser {
    private UserRepo userRepo;

    public void createUser(String username) {

        User user = new User(1, username, false);

        user.setId(1);
        user.setUsername(username);
        user.setStatus(false);

        System.out.println(user);


    }
    }
