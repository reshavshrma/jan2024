import java.util.*;


public class PrimeNoUsingForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no to check: ");
        int enteredNum = scanner.nextInt();

        int count = 0;
        for(int i = 2; i <= enteredNum; i++) {
            if(enteredNum % i == 0) {
                count++;
            }
        }

        if(count == 1) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }
    }
}