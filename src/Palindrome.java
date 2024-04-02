import java.util.*;

public class Palindrome {
    Scanner scanner = new Scanner(System.in);
    public void checkPalindrome() {
        System.out.print("Enter a number: ");
        int enteredNum = scanner.nextInt(); //1221

        int tempNum = enteredNum;
        int reverseNum = 0;
        while(enteredNum > 0) {
            int digit = enteredNum % 10;
            reverseNum = reverseNum * 10 + digit;
            enteredNum = enteredNum/10;
        }

//        System.out.println("********");
//        System.out.println(enteredNum);
//        System.out.println(reverseNum);
//        System.out.println("********");

        if(tempNum == reverseNum) {
            System.out.println("\nYes, it is a palindrome number.");
        } else {
            System.out.println("\nNo, it is not a palindrome number.");
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome();
    }
}