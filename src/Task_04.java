import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean yOrN;
        double priceTotal = 0;
        do {
                double priceInput = InputHelper.getRangedDouble(scan, "Enter the item price", 0.50, 10);
                priceTotal = priceInput + priceTotal;
                yOrN = InputHelper.getYNConfirm(scan, "Continue shopping? [Y/N]");
        } while (yOrN);
        System.out.printf("%-10s%10.2f","Your total price is:",priceTotal);
    }
}
