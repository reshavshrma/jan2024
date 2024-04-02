import java.util.*;

public class LCM {

    Scanner scanner = new Scanner(System.in);
    public void lcmOfNos() {
        System.out.print("Enter the number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter another number: ");
        int secondNum = scanner.nextInt();

        int i = 1;
        while(true) {
            int factor = firstNum * i;
            if(factor % secondNum == 0) {
                System.out.println("\nLCM of " + firstNum + " and " + secondNum + " is " + factor);
                return;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        LCM lcm = new LCM();
        lcm.lcmOfNos();
    }
}
