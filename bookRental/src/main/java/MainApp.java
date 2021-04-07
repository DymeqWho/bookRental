import repository.UserRepo;
import service.CreateUser;
import user.User;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Hello Dymek!");


        UserRepo userRepo = new UserRepo();
        CreateUser createUser = new CreateUser();

        User ktostam = createUser.createUser(userRepo.getUserRepoList(), "Ktośtam");
        User ktos_2 = createUser.createUser(userRepo.getUserRepoList(), "Ktoś 2");
        User agata = createUser.createUser(userRepo.getUserRepoList(), "Agata");
        User michal = createUser.createUser(userRepo.getUserRepoList(), "Michał");

        userRepo.addUserToRepoList(ktostam);
        userRepo.addUserToRepoList(ktos_2);
        userRepo.addUserToRepoList(agata);
        userRepo.addUserToRepoList(michal);

        System.out.println(userRepo.getUserById(2).toString());
    }

}

