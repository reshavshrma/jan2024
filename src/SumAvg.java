import java.util.*;

public class SumAvg {
    //int[] arr;
    Scanner scanner = new Scanner(System.in);

    // input array from user
    public int[] inputArray() {
        System.out.print("Enter the size of an array: ");
        int size =  scanner.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the elements no. " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // logic for sum and then average of all the elements in an array
    public void SumOfArrayElementsAndAvg(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements in an array: " + sum);
        int avg = (sum/arr.length);
        System.out.print("Average of all the elements of an array: " + avg);
    }

    public static void main(String... args) {
        SumAvg sumavg = new SumAvg();
        int[] arr = sumavg.inputArray();
        sumavg.SumOfArrayElementsAndAvg(arr);
    }
}