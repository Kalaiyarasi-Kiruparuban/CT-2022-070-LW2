import java.util.Scanner;

public class Q03 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        //convert degrees Celsius to equivalent degrees Fahrenheit
        System.out.println("Enter the  temperature in degrees Celsius: ");
        double celcius = input.nextDouble();
        double fahrenheit = ((1.8 * celcius) + 32);
        System.out.printf(celcius + " celcius is equivalent to " + fahrenheit + " fahrenheit" );
    }
}
