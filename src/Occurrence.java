import java.util.Scanner;

public class Occurrence {

    Scanner scanner = new Scanner(System.in);

    // input array
    public int[] inputArray() {
        System.out.print("\nEnter the size of an array: ");
        int size =  scanner.nextInt();

        int[] arr = new int[size];
        System.out.println();
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the elements no. " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // no of times occurrence of an elements in an array
    public void OccurrenceOfElements(int[] arr) {
        //int[] arr = {60,6,30,51,33,30,33,6,30,45,30,30};

        System.out.print("\nEnter an element which you want to check: ");
        int enteredNum = scanner.nextInt();

        int count = 0;
        /*for(int i = 0; i < arr.length; i++) {
            if(enteredNum == arr[i]) {
                count++;
            }
        }*/

        int i = 0;
        while(i < arr.length) {
            if(enteredNum == arr[i]) {
                count++;
            }
            i++;
        }

        if(count == 0) {
            System.out.println("\nNot found!!!");
        } else if (count == 1){
            System.out.println("\nYes, " + enteredNum + " is found " + count + " in this array.");
        } else {
            System.out.println("\nYes, " + enteredNum + " is found " + count + " times in this array.");
        }

    }
    public static void main(String ...args) {
        Occurrence occ = new Occurrence();
        while(true) {
            int[] arr = occ.inputArray();
            occ.OccurrenceOfElements(arr);
        }
    }
}