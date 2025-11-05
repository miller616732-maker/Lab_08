import java.util.Scanner;

import static java.lang.System.out;

public class InputHelper {
    //getNonZeroLenString returns a String of non-zero length
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        boolean valid = false;
        String userInput;
        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (!userInput.isEmpty()) {
                valid = true;
            } else {
                System.out.println("Error: Enter a string of non-zero length");
            }
        } while (!valid);
        return userInput;
    }

    //The getInt method returns a valid int value back to the user
    public static int getInt(Scanner scan, String prompt) {
        boolean valid = false;
        int userInput = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: Enter an integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        boolean valid = false;
        int userInput = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                } else {
                    System.out.println("Error: Input must be between " + min + " and " + max + ".");
                    scan.nextLine();
                }
            } else {
                System.out.println("Error: Enter an integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    public static double getDouble(Scanner scan, String prompt) {
        boolean valid = false;
        double userInput = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                userInput = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: Enter an double value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        boolean valid = false;
        double userInput = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                userInput = scan.nextDouble();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                } else {
                    System.out.println("Error: Input must be between " + min + " and " + max + ".");
                    scan.nextLine();
                }
            } else {
                System.out.println("Error: Enter an double value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        boolean valid = false;
        int userInput = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput > 0) {
                    valid = true;
                } else {
                    System.out.println("Error: Input must be positive");
                    scan.nextLine();
                }
            } else {
                System.out.println("Error: Enter an integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        boolean valid = false;
        String userInput;
        boolean returnBoolean = false;
        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                valid = true;
                returnBoolean = true;
            } else if (userInput.equalsIgnoreCase("n")) {
                valid = true;
            } else {
                System.out.println("Enter Y or N");
            }
        } while (!valid);
        return returnBoolean;

    }

    public static String getRegExString(Scanner scan, String prompt, String regExPattern) {
        boolean valid = false;
        String userInput;
        out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (userInput.matches(regExPattern)) {
                valid = true;
            } else {
                out.println("Please try again. Must match specified format.");
            }
        } while (!valid);
        return userInput;
    }
}