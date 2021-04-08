package service;

import java.util.Scanner;

public class IntegerVerification {

    public int chooseInt(String optionalString) {
        Scanner scanner = new Scanner(System.in);
        int choiceInt;

        do {
            System.out.print(optionalString);
            String choiceString = scanner.nextLine();

            try {
                choiceInt = Integer.parseInt(choiceString);
                if (choiceInt > 0) {
                    return choiceInt;
                } else {
                    System.out.println("Liczba powinna być większa od 0! ");
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("To nie jest numer! Podaj właściwy numer: ");
            }
        } while (true);
    }
}
