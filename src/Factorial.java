import java.util.*;

public class Factorial {
    // factorial of a  number
    Scanner scanner = new Scanner(System.in);

    public void factorialOfNumber() {
        System.out.print("Enter a number: ");
        final int enteredNum = scanner.nextInt();

        long factorial = 1;
        for (int num = 1; num <= enteredNum; num++) {
            factorial *= num;
            //System.out.println(factorial);
        }
        System.out.println("\nFactorial of " + enteredNum + " is " + factorial);
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        fact.factorialOfNumber();
    }
}