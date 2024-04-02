import java.util.*;

public class Prime {
    Scanner scanner = new Scanner(System.in);

    public void isPrimeOrNot() {
        System.out.print("Enter a number you want to check: ");
        int enteredNum = scanner.nextInt();

        int count = 0;
        for(int i = 2; i <= enteredNum; i++) {
            if(enteredNum % i == 0) {
                count++;
            }
        }

        if(count == 1) {
            System.out.println("\n" + enteredNum + " is a prime number.");
        } else {
            System.out.println("\n" + enteredNum + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.isPrimeOrNot();
    }
}
