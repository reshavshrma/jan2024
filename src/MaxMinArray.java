import java.util.Scanner;

public class MaxMinArray {

    // Input an array from the user
    public int[] inputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of elements in an array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter the element no " + (i+1) + " : " );
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // logic for max element in an array
    public void maxArray(int[] arr) {
        int i = 0;
        int max = arr[0];
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        System.out.println(max + " is the maximum number in this array.");
    }

    // logic for min element in an array
    public void minArray(int[] arr) {
        int i = 0;
        int min = arr[0];
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        System.out.println(min + " is the minimum number in this array.");
    }


    public static void main(String[] args) {
        MaxMinArray m = new MaxMinArray();
        int[] arr = m.inputArray();
        m.maxArray(arr);
        m.minArray(arr);
    }
}
