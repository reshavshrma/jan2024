import java.util.*;

public class MultiplicationTableUsingForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number whose table you want: ");
        int enteredNum = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            int result = enteredNum * i;
            System.out.println(enteredNum + " * " + i + " = " + result);
        }
    }
 }
