import java.util.*;
public class Reverse {
    Scanner scanner = new Scanner(System.in);
    public void doReverse() {
        System.out.print("Enter a number whose reverse you want to check: ");
        int enteredNum = scanner.nextInt();

        int reverse = 0;
        while(enteredNum > 0) {
            int digit = enteredNum % 10;
            reverse = reverse * 10 + digit;
            enteredNum /= 10;
        }
        System.out.println("Reverse of the entered number is " + reverse);
    }
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        reverse.doReverse();
    }
}
