/**
 * @class: UserInput
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description: Create a method, getString, that allows the user to enter text
 * from the keyboard and return the String entered by the user.
 */

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String userInput = getString();
        System.out.println("You entered: " + userInput);
    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
