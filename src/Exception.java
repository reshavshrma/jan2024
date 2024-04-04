import java.util.*;

public class Exception {
    Scanner scanner = new Scanner(System.in);
    public void divisionMethod() throws Throwable {
        while(true) {
            System.out.print("\nEnter the first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int secondNum = scanner.nextInt();

            try {
                int[] arr = new int[5];
                arr[6] = firstNum/secondNum;
                System.out.println("Result: " + arr[6]);
            } catch(ArithmeticException exception) {
                System.out.println("\nNot possible divide by zero.");
                throw exception;
            } catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println("\nArray is out of bound exception. Check the index value.");
            } catch(java.lang.Exception exception) {
                System.out.println("\nException occurred.");
            } catch(Throwable exception) {
                System.out.println("\nException occurred.");
            } finally {
                System.out.println("\nInside Finally Block of Exception.");
            }
        }
    }
    public static void main(String ...args) throws Throwable {
        Exception e = new Exception();
        e.divisionMethod();
    }
}
