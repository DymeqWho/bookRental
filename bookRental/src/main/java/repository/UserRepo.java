package repository;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private final List<User> userRepoList = new ArrayList<>();

    public List<User> getUserRepoList() {
        return userRepoList;
    }

    public void addUserToRepoList(User user){
        userRepoList.add(user);
    }

    public User getUserById(int id){
        return userRepoList.get(id);
    }

}
