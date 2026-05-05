import java.util.Scanner;

public class Q02 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        // converting centimeters into feet and inches
        System.out.println("Enter length in centimeters: ");
        double cm = input.nextDouble();

        double convert = cm/2.54;
        int feet = (int) (convert / 12);
        double inches = convert % 12;

        System.out.printf(cm + " cm is equivalent to " + feet + " feet and " + inches + " inches");
    }
}

