import java.time.Year;
import java.util.Scanner;

public class Q06 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int currentyear = Year.now().getValue();
        System.out.println("Enter your year of birth: ");
        int yearofbirth = scanner.nextInt();
        int age = currentyear - yearofbirth;

        System.out.println("You were born in " + yearofbirth + " and will be (are) " + age + " this year.");

    }
}
