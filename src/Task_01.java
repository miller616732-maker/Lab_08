import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = InputHelper.getNonZeroLenString(scan, "Enter your username");
        System.out.println("Your username is " + userName);
    }
}