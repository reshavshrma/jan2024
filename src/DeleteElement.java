import java.util.Scanner;

class DeleteElement {

    Scanner scanner = new Scanner(System.in);

    // Input an array from the user
    public int[] inputArray() {
        System.out.print("Enter the size of elements in an array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element no " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Input no which to delete
    public int deleteNum() {
        System.out.print("\nEnter the number you want to delete: ");
        int num = scanner.nextInt();
        return num;
    }

    // Logic to delete an element array
    public void deleteElementFromArray(int[] arr, int num) {
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != num) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }

        // Update the length of the array
        int[] newArr = new int[j];
        for (int k = 0; k < j; k++) {
            newArr[k] = arr[k];
        }

        // Print the modified array
        System.out.println("\nArray after deletion: ");
        for (int k = 0; k < j; k++) {
            System.out.print(newArr[k] + " ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        DeleteElement d = new DeleteElement();
        int[] arr = d.inputArray();
        int num = d.deleteNum();
        d.deleteElementFromArray(arr, num);
    }
}
