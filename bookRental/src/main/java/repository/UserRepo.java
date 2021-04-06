package repository;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> userRepo = new ArrayList<>();

    public List<User> getUserRepo() {
        return userRepo;
    }

}
