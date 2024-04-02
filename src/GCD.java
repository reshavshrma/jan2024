import java.util.*;

public class GCD {
    Scanner scanner = new Scanner(System.in);
    public void gcdOfNos() {
        System.out.print("Enter one number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter another number: ");
        int secondNum = scanner.nextInt();

        int gcd = 1;
        int i = 2;
        int least = Math.min(firstNum, secondNum);
        while( i <= least) {
            if(firstNum % i == 0 && secondNum % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("\nGDC of " + firstNum + " and " + secondNum + " is " + gcd);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        gcd.gcdOfNos();
    }
}
