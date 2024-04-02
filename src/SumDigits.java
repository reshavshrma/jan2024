import java.util.*;

public class SumDigits {
    // sum of digits of an integer
    Scanner scanner = new Scanner(System.in);
    public void sumOfDigitsOfNumber() {
        System.out.print("Enter an integer (whose sum of digits you want to calculated): ");
        int enteredNum = scanner.nextInt();

        int sum = 0;
        while(enteredNum > 0) {
            sum += enteredNum % 10;
            enteredNum /=  10;
        }
        System.out.println("\nSum of all digits of " + enteredNum + " is " + sum);
    }

    public static void main(String[] args) {
        SumDigits sd = new SumDigits();
        sd.sumOfDigitsOfNumber();
    }
}