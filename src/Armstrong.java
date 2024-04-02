import java.util.*;

public class Armstrong {
    Scanner scanner = new Scanner(System.in);
    public void checkArmstrongOrNot() {
        System.out.print("Enter the number you want to check for: ");
        int enteredNum = scanner.nextInt();

        int originalNum = enteredNum;
        int armstrong = 0;
        while(enteredNum > 0) {
            int digit = enteredNum % 10;
            armstrong = (digit * digit * digit) + armstrong;
            enteredNum = enteredNum/10;
        }

        if(originalNum == armstrong) {
            System.out.println("\nIt is an armstrong number.");
        } else {
            System.out.println("\nIt is not an armstrong number.");
        }
    }

    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        armstrong.checkArmstrongOrNot();
    }
}