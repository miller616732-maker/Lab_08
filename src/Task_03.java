import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        int day;
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "What year were you born?", 1950, 2011);
        int month = InputHelper.getRangedInt(scan, "What month were you born?", 1, 12);
        if (month == 2) {
            day = InputHelper.getRangedInt(scan, "What day were you born?", 1, 29);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = InputHelper.getRangedInt(scan, "What day were you born?", 1, 30);
        } else {
            day = InputHelper.getRangedInt(scan, "What day were you born?", 1, 31);
        }
        int hour = InputHelper.getRangedInt(scan, "What hour were you born?", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "What minute were you born?", 1, 59);
        System.out.println("Year: " + year);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
    }
}
