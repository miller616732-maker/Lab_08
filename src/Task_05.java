import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yourSSN;
        String yourChoice;
        String yourUCID;
        yourSSN = InputHelper.getRegExString(scan, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + yourSSN);
        yourUCID = InputHelper.getRegExString(scan, "Enter your Student M Number", "(M|m)\\d{5}");
        System.out.println("Your Student M Number is " + yourUCID);
        yourChoice = InputHelper.getRegExString(scan, "Menu:    O - Open   S - Save   V- View   Q - Quit", "[OoSsVvQq]");
        System.out.println("You chose: " + yourChoice.toUpperCase());
    }
}
