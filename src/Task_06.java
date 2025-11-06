import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yourC = InputHelper.getDouble(scan, "Enter the degrees in celsius");
        double yourF = celsiusToFahrenheit(yourC);
        System.out.printf("%-10s%5.2f", "Your temperature in fahrenheit is: ", yourF);
    }
    public static double celsiusToFahrenheit(double Celsius) {
        double fahrenheitDegrees;
        fahrenheitDegrees = ((Celsius * 9/5) + 32);
        return fahrenheitDegrees;
    }
}
