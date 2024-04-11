import java.util.*;

public class EvenOrOdd {

    Scanner scanner = new Scanner(System.in);

    public void checkEvenOrOdd() {
        System.out.print("Enter a number to check whether it is even or odd number: ");
        int enteredNum = scanner.nextInt();

        String evenOrOdd = enteredNum % 2 == 0 ? "even" : "odd";
        System.out.println("Number is " + evenOrOdd);
    }

    public static void main(String[] args) {
        EvenOrOdd check = new EvenOrOdd();
        check.checkEvenOrOdd();
    }
}
