import java.util.Scanner;

public class SortedArray {

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

    public boolean isIncreasingOrderSorted(int[] arr) {
        int i = 1;
        while(i < arr.length) {
            if(arr[i] > arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public boolean isDecreasingOrderSorted(int[] arr) {
        int i = 1;
        while(i < arr.length) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        SortedArray s = new SortedArray();
        int[] arr = s.inputArray();
        boolean isInc = s.isIncreasingOrderSorted(arr);
        boolean isDec = s.isDecreasingOrderSorted(arr);

        if(isInc || isDec) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
