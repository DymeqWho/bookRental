package controller;

import repository.UserRepo;
import service.CreateUser;
import service.EditUser;
import service.IntegerVerification;
import service.ShowUserList;

public class Menu {

    private final UserRepo userRepo = new UserRepo();
    private final CreateUser createUser = new CreateUser();
    private final ShowUserList showUserList = new ShowUserList();
    private final IntegerVerification integerVerification = new IntegerVerification();
    private final EditUser editUser = new EditUser();

    public void showMenu() {
        System.out.println("Menu: ");
        String createUserString = "1. Stwórz użytkownika";
        System.out.println(createUserString);
        String showUserListString = "2. Pokaż listę użytkowników";
        System.out.println(showUserListString);
        String editUserString = "3. Edytuj użytkownika";
        System.out.println(editUserString);
        String endOfProgramString = "4. Zakończ program.";
        System.out.println(endOfProgramString);

        int choiceInt = integerVerification.chooseInt("Którą opcję wybierasz?: ");

        System.out.println("Wybrana została opcja: " + choiceInt);
        System.out.println();

        if (choiceInt == 1) {
            System.out.println(createUserString);
            createUser.createUser(userRepo);
            showMenu();
        }
        if (choiceInt == 2) {
            System.out.println(showUserListString);
            showUserList.showUserList(userRepo);
            showMenu();
        }
        if(choiceInt == 3){
            System.out.println(editUserString);
            editUser.editUserById(userRepo);
            showMenu();
        }
        if(choiceInt == 4){
            System.out.println(endOfProgramString);
            System.exit(0);
        }
    }
}
