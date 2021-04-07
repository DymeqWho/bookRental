import controller.Menu;
import repository.UserRepo;
import service.CreateUser;
import dao.user.User;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("*** Biuro obsługi biblioteki ***");
        System.out.println();
        Menu menu = new Menu();
        menu.showMenu();

//        System.out.println("Hello!");
//        System.out.println("Hello Dymek!");
//
//
//        UserRepo userRepo = new UserRepo();
//        CreateUser createUser = new CreateUser();
//
//        User ktostam = createUser.createUser(userRepo.getUserRepoList(), "Ktośtam");
//        userRepo.addUserToRepoList(ktostam);
//        User ktos_2 = createUser.createUser(userRepo.getUserRepoList(), "Ktoś 2");
//        userRepo.addUserToRepoList(ktos_2);
//        User agata = createUser.createUser(userRepo.getUserRepoList(), "Agata");
//        userRepo.addUserToRepoList(agata);
//        User michal = createUser.createUser(userRepo.getUserRepoList(), "Michał");
//        userRepo.addUserToRepoList(michal);
//
//        System.out.println(userRepo.getUserById(1).toString());
//        System.out.println(userRepo.getUserById(2).toString());
//        System.out.println(userRepo.getUserById(3).toString());
//        System.out.println(userRepo.getUserById(4).toString());

    }

}

