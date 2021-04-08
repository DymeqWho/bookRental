package service;

import repository.UserRepo;

public class ShowUserList {

    public void showUserList(UserRepo userRepo) {
        if (userRepo.getUserRepoList().isEmpty()) {
            System.out.println("Lista jest pusta!");
            System.out.println();
        }
        int repoSize = userRepo.getUserRepoList().size();
        for (int i = 0; i < repoSize; i++) {
            System.out.println(userRepo.getUserRepoList().get(i));
        }
        System.out.println();
    }
}
