import java.util.*;

public class Minimum {

    Scanner scanner = new Scanner(System.in);

    public void checkMinimum() {
        System.out.print("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNUm = scanner.nextInt();

        int minimumNum = firstNum < secondNUm ? firstNum : secondNUm;
        System.out.println("\n" + minimumNum +  " is the minimum number");
    }

    public static void main(String[] args) {
        Minimum m = new Minimum();
        m.checkMinimum();
    }
}
