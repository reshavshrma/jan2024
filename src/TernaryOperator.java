import java.util.*;

public class TernaryOperator {
    Scanner scanner = new Scanner(System.in);
    public void TernaryOp() {
        System.out.print("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int secondNum = scanner.nextInt();

        int greaterNum = firstNum > secondNum ? firstNum : secondNum;
        System.out.println("\n" + greaterNum + " is the greatest number.");
    }
    public static void main(String[] args) {
        TernaryOperator t = new TernaryOperator();
        t.TernaryOp();
    }
}
