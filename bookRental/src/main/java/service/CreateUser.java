package service;

import repository.UserRepo;
import user.User;

import java.util.ArrayList;

public class CreateUser {
    private final UserRepo userRepo = new UserRepo(new ArrayList<>());

    public void createUser(String username) {

        User user = new User();

        user.setId(1);
        user.setUsername(username);
        user.setStatus(false);

        if (userRepo.getUserRepo().isEmpty()) {
            user.setId(1);
        } else {
            user.setId(userRepo.getUserRepo().size() + 1);
        }
        user.setUsername(username);
        user.setStatus(false);
        userRepo.getUserRepo().add(user);

        System.out.println(user);
    }
}
