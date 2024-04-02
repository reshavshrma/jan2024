import java.sql.SQLOutput;
import java.util.*;

public class Fibonacci {
    Scanner scanner = new Scanner(System.in);
    public void checkFibonacci() {

        System.out.print("Enter a number upto which fibonacci's series is required: ");
        int enteredNum = scanner.nextInt();

        int firstNum = 0, secondNum = 1, nextNum = 0;
        System.out.print(firstNum + " " + secondNum + " ");
        for(int i = 0; i < enteredNum; i++) {
            nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.checkFibonacci();
    }
}
