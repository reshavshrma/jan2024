import java.util.*;

public class DivideException {

    public static void main(String args[]) {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int secondNum = scanner.nextInt();

            try {
                int result = firstNum/secondNum;
                System.out.println();
                System.out.println("The value of \"first number\" is " + firstNum);
                System.out.println("The value of \"second number\" is " + secondNum);
                System.out.println("The value of \"result\" is " + result);
                System.out.println();
            }

            catch(ArithmeticException e) {
                System.out.println("\nDivide by zero is not allowed.");
                System.out.println();
            }
        }
    }
}
