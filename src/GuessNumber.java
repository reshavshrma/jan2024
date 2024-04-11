import java.util.*;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 5, guessNum;

        do {
            System.out.print("Enter a number: ");
            guessNum =  scanner.nextInt();
        } while(guessNum != num);

        System.out.println("Guessed Successfully.");

//        System.out.print("Enter a number whose table you want: ");
//        long enteredNum = scanner.nextLong();
//
//        for(long i = 1; i <= 10; i++) {
//            long result = enteredNum * i;
//            System.out.println(enteredNum + " * " + i + " = " + result);
//        }

//        while(true) {
//            System.out.println("Enter a number which you want to check: ");
//            int enteredNum = scanner.nextInt();
//
//            int count = 0;
//            for(int i = 2; i <= enteredNum; i++) {
//                if(enteredNum % i == 0) {
//                    count++;
//                }
//            }
//
//            if(count == 1) {
//                System.out.println("Prime No.");
//            } else {
//                System.out.println("Not a prime no.");
//            }
//        }
    }
}
