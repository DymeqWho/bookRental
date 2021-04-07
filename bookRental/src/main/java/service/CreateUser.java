package service;

import dao.user.User;

import java.util.List;


public class CreateUser {

    public User createUser(List<User> userList, String username) {

        User user = new User();

        if (userList.isEmpty()) {
            user.setId(1);
        } else {
            user.setId(userList.size() + 1);
        }
        user.setUsername(username);
        user.setStatus(false);

        return user;
    }
}