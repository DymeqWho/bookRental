package service;

import dao.user.User;
import repository.UserRepo;

import java.util.Scanner;

public class EditUser {

    public void editUserById(UserRepo userRepo) {
        ShowUserList showUserList = new ShowUserList();
        IntegerVerification integerVerification = new IntegerVerification();
        YesOrNo yesOrNo = new YesOrNo();

        Scanner scanner = new Scanner(System.in);
        User user;

        if (userRepo.getUserRepoList().isEmpty()) {
            System.out.println("Lista użytkowników jest pusta!");
            System.out.println();

        } else {
            do {
                System.out.println("Którego użytkownika chcesz edytować?");
                showUserList.showUserList(userRepo);

                int id = integerVerification.chooseInt("Wpisz jego id: ");


                if (id > userRepo.getUserRepoList().size()) {
                    System.out.println("Nie ma użytkownika o takim ID!");
                } else {
                    user = userRepo.getUserRepoList().get(id - 1);
                    System.out.println("Wybrany został użytkownik: " + user);
                    if (yesOrNo.declareYesOrNo("Czy o niego chodziło?"))
                        break;
                }
            } while (true);

            do {
                System.out.println("Co chcesz edytować u " + user + "?");
                System.out.println("1. username: " + user.getUsername());
                System.out.println("2. status: " + user.isStatus());
                System.out.println();

                do {
                    int editChoice = integerVerification.chooseInt("Jaki jest Twój wybór?: ");
                    if (editChoice == 1)
                        System.out.print("Podaj nowe imię: ");
                    if (editChoice == 1) {
                        String newName = scanner.nextLine();
                        user.setUsername(newName);
                        System.out.println("Nowy username: " + newName);
                        break;
                    } else if (editChoice == 2) {
                        if (!user.isStatus()) {
                            System.out.println("Status zmieniono na aktywny!");
                            user.setStatus(true);
                        } else {
                            System.out.println("Status zmieniono na nieaktywny!");
                            user.setStatus(false);
                        }
                        break;
                    } else {
                        System.out.println("Nie ma takiej opcji!");
                    }
                } while (true);

                System.out.println("Zmieniony użytkownik prezentuje się w ten sposób: ");
                System.out.println(user);
            } while (!yesOrNo.declareYesOrNo("Czy to wszystko, co chcesz zmienić u tego użytkownika?"));
        }
    }
}

