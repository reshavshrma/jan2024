public class ArrayException {

    public static void main(String args[]) {

        int[] arr = {2,4,6,8,12};

        try {
            for(int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        }

        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("\nException Occurred..!!!");
        }
    }
}