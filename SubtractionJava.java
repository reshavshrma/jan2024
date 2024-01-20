import java.util.Scanner;

class SubtractionJava {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Welcome to Java Programming...!! Let's create a simple subtraction program" + "\n");

        while(true) {      // while loop so that it will run without stoping 

            System.out.print("Enter the first number: ");
            int n1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int n2 = scanner.nextInt();

            int result = sub(n1,n2);

            System.out.println("\n" + "Subtraction of a and b is " + result + "\n");

            System.out.println("**************************" + "\n");
        }
    }

    public static int sub(int a, int b) {
        return a-b;
    }
}