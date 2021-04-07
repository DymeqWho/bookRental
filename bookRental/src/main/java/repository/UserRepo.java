package repository;

import dao.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private final List<User> userRepoList = new ArrayList<>();

    public List<User> getUserRepoList() {
        return userRepoList;
    }

    public void addUserToRepoList(User user) {
        userRepoList.add(user);
    }

    public User getUserById(int id) {
        id -= 1;
        return userRepoList.get(id);
    }

}
