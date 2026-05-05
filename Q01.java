import java.util.Scanner;

public class Q01 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        // a.The square root of B^2 + 4AC (A and C are distinct variables)
        System.out.println("To find the square root of B^2 + 4AC," );
        System.out.print("Enter value for A: ");
        double A = input.nextDouble();
        System.out.print("Enter value for B: ");
        double B = input.nextDouble();
        System.out.print("Enter value for C: ");
        double C = input.nextDouble();
        double a_Answer= Math.sqrt(Math.pow(B, 2) + (4 * A * C));
        System.out.println("Answer is : " + a_Answer);

        // b.The square root of X + 4Y^3
        System.out.println("\nTo find the square root of X + 4Y^3, ");
        System.out.print("Enter value for X: ");
        double X = input.nextDouble();
        System.out.print("Enter value for Y: ");
        double Y = input.nextDouble();
        double b_Answer = Math.sqrt(X + (4 * (Math.pow(Y, 3))));
        System.out.println("Answer is :" + b_Answer);

        // c.The cube root of the product of X and Y
        System.out.println("\nTo find the cube root of the product of X and Y, ");
        System.out.print("Enter value for X: ");
        double x = input.nextDouble();
        System.out.print("Enter value for Y: ");
        double y = input.nextDouble();
        double c_Answer = Math.cbrt(x * y);
        System.out.println("Answer is : " + c_Answer);

        // d. The area of a circle
        System.out.println("To find the The area of a circle, ");
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double d_Answer = Math.PI * Math.pow(radius,2);
        System.out.println("Area of the circle is : " + d_Answer);
    }
}