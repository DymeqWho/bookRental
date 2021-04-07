import service.CreateUser;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Hello Dymek!");


        CreateUser createUser = new CreateUser();

        createUser.createUser("Ktośtam");
        createUser.createUser("Ktoś 2");
        createUser.createUser("Agata");
        createUser.createUser("Michał");


    }

}

