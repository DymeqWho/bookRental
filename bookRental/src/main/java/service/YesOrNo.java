package service;

import java.util.Scanner;

public class YesOrNo {

    public boolean declareYesOrNo(String questionString) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(questionString + " (wybierz t/n):");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("t")) {
            return true;
        } else if (!choice.equals("n")) {
            System.out.println("Niepoprawna komenda, ale pewnie chodziło o \"n\" ;-)");
        }
        return false;
    }
}

