public class MaxArray2 {
    public static void main(String[] args) {
        int[] arr = {24,12,136,54,89};

        int max = Integer.MIN_VALUE;

        for(int num : arr) {
            if(max < num) {
                max = num;
            }
        }
        System.out.println(max + " is biggest number in the array.");

        int min = Integer.MAX_VALUE;

        for(int num : arr) {
            if(min > num) {
                min = num;
            }
        }
        System.out.println(min + " is smallest number in the array.");

    }
}
