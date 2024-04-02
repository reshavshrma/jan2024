import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Good Evening Reshav, Please tell me your age: ");
        String age = scanner.next();

        System.out.println("Okay, your age is 20, so you are now eligible for voting." +
                " Kindly give precious vote as on 28th of April 2024.");
    }
}
