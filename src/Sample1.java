import java.util.*;


public class Sample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number whose fact you want to know: ");
        int enteredNum = scanner.nextInt();

        int fact = 1;
        for(int num = 1; num <= enteredNum; num++) {
            fact =  fact * num;
        }
        System.out.println(fact);
    }
}