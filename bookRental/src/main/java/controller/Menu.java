package controller;

import dao.user.User;
import repository.UserRepo;
import service.CreateUser;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final UserRepo userRepo = new UserRepo();
    private final CreateUser createUser = new CreateUser();

    public void showMenu() {
        System.out.println("Menu: ");
        String createUser = "1. Stwórz użytkownika";
        System.out.println(createUser);
        String showUserList = "2. Pokaż listę użytkowników";
        System.out.println(showUserList);

        int choiceInt;

        do {
            System.out.print("Którą opcję wybierasz?: ");
            String choiceString = scanner.nextLine();

            try {
                choiceInt = Integer.parseInt(choiceString);
                if (choiceInt > 0) {
                    break;
                } else {
                    System.out.println("Liczba powinna być większa od 0! ");
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("To nie jest numer! Podaj właściwy numer: ");
            }
        } while (true);

        System.out.println("Wybrana została opcja: " + choiceInt);
        System.out.println();

        if (choiceInt == 1) {
            System.out.println(createUser);
            createUser();
            showMenu();
        }
        if (choiceInt == 2) {
            System.out.println(showUserList);
            showUserList();
            showMenu();
        }
    }

    private void createUser() {
        System.out.print("Podaj imię użytkownika: ");
        User user = createUser.createUser(userRepo.getUserRepoList(), scanner.nextLine());
        userRepo.addUserToRepoList(user);
        System.out.println("Stworzyłeś: ");
        System.out.println(userRepo.getUserById(user.getId()));
        System.out.println();
    }

    private void showUserList() {
        if (userRepo.getUserRepoList().isEmpty()) {
            System.out.println("Lista jest pusta!");
            System.out.println();
        }
        int repoSize = userRepo.getUserRepoList().size();
        for (int i = 0; i < repoSize; i++) {
            System.out.println(userRepo.getUserRepoList().get(i));
        }
    }
}
