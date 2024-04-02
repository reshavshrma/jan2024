import java.util.*;

class SumOdd {
    // sum of all odd nos from 1 to N (input by user)
    Scanner sc = new Scanner(System.in);
    public void sumOfOddNumbers() {
        System.out.print("Enter N number: ");
        int enteredNum = sc.nextInt();

        int sum = 0;
        for(int startNum = 1; startNum <= enteredNum; startNum++) {
            if(startNum % 2 != 0) {
                sum += startNum;
            }
        }
        System.out.println("\nSum of all odd numbers from 1 to " + enteredNum + " is " + sum);
    }

    public static void main(String[] args) {
        SumOdd s = new SumOdd();
        s.sumOfOddNumbers();
    }
}