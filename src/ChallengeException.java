import java.util.*;

class ChallengeException {
    Scanner scanner = new Scanner(System.in);

    // exception handlling
    public void checkException() {

        while(true) {
            try {
                System.out.print("\nEnter two integers: ");
                int firstInt = scanner.nextInt();
                int secondInt = scanner.nextInt();

                try {
                    int result = (firstInt / secondInt);
                    System.out.println("\nResult: " + result);
                } catch (ArithmeticException exception) {
                    System.out.println("\nException occurred. Divide by zero is not possible." + "\n" + exception);
                }
            } catch (java.lang.Exception exception) {
                System.out.println("\nOopps..!! Exception occurred. Wrong input entered by the user.");
                scanner.next();
                continue;
            }
        }
    }

    // main method
    public static void main(String[] args) {
        ChallengeException p = new ChallengeException();
        p.checkException();
    }
}