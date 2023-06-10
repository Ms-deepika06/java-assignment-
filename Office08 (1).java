import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int x = scanner.nextInt(); // Number of working hours from Monday to Thursday
            int y = scanner.nextInt(); // Number of working hours on Friday

            int totalHours = (x * 4) + y; // Total working hours in a week
            System.out.println(totalHours);
        }
    }
}
