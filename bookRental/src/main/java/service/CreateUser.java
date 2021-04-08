package service;

import dao.user.User;
import repository.UserRepo;

import java.util.Scanner;


public class CreateUser {

    public void createUser(UserRepo userRepo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię użytkownika: ");
        String username = scanner.nextLine();

        User user = new User();

        if (userRepo.getUserRepoList().isEmpty()) {
            user.setId(1);
        } else {
            user.setId(userRepo.getUserRepoList().size() + 1);
        }
        user.setUsername(username);
        user.setStatus(false);

        userRepo.addUserToRepoList(user);
        System.out.println("Stworzyłeś: ");
        System.out.println(userRepo.getUserById(user.getId()));
        System.out.println();

    }
}