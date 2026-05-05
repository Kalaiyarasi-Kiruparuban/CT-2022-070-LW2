import java.util.Scanner;

public class Q05 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0/9.0) * (fahrenheit - 32);
        System.out.printf( fahrenheit + " fahrenheit is equivalent to " + celsius + " celcius");
    }
}
