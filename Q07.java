import java.util.Scanner;

public class Q07 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in kilograms (integer): ");
        int w = scanner.nextInt();

        System.out.println("Enter height in centimeters (integer): ");
        int h = scanner.nextInt();

        double bmi = w / Math.pow((h / 100.0), 2);

        System.out.println("Your BMI is: " + bmi);

        if (bmi >= 20 && bmi <= 25) {
            System.out.println("Status: Your BMI is considered as Normal.");
        } else if (bmi < 20) {
            System.out.println("Status: Your BMI is considered as Below Normal.");
        } else {
            System.out.println("Status: Your BMI is considered as Above Normal.");
        }
    }
}
