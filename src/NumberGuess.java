import java.util.*;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 5, enteredNum;
        do {
            System.out.print("Enter your number: ");
            enteredNum = scanner.nextInt();
        } while(enteredNum != num);
        System.out.println("Correct Number");
    }
}
