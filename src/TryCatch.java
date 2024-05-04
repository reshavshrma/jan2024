public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This will throw an ArrayIndexOutOfBoundsException
            int x = 5 / 0; // This will throw an ArithmeticException
        }  catch (java.lang.Exception e) {
            // This will catch any other type of exception not caught by the previous catch blocks
            System.out.println("Some other exception occurred!");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                System.out.println("Class: " + element.getClassName());
                System.out.println("Method: " + element.getMethodName());
                System.out.println("File: " + element.getFileName());
                System.out.println("Line: " + element.getLineNumber());
                System.out.println("--------------------------------------");
            }
        }
    }

}