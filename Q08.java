import java.util.Scanner;

public class Q08 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.println("Enter the radius of the sphere: ");
        double r = scanner.nextDouble();
        double volume = (4.0 / 3.0) * PI * Math.pow(r , 3);
        System.out.println("The volume of the sphere is: " + volume);
    }
}
