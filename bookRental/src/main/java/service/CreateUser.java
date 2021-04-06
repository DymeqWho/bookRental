package service;

import repository.UserRepo;
import user.User;

import java.util.Scanner;

public class CreateUser {
    private UserRepo userRepo;

    public void createUser(){
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        user.setId(userRepo.getUserRepo().size() + 1);
        user.setUsername(scanner.nextLine());
        user.setStatus(false);

        this.userRepo.getUserRepo().add(user);
    }


}
