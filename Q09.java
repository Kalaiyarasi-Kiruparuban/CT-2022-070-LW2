import java.util.Scanner;

public class Q09 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount (P): ");
        double P = scanner.nextDouble();

        System.out.println("Enter interest rate (R): ");
        double R = scanner.nextDouble();

        System.out.println("Enter number of year (N): ");
        int N = scanner.nextInt();

        double amount = P * Math.pow((1 + (R / 100.0)), N);

        System.out.printf("In " + N + " years, your investment will grow to: " + amount + " dollars");
    }
}
