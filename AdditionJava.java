import java.util.Scanner;

class AdditionJava {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Welcome to Java Programming...!! Let's create a simple addition program" + "\n");

        while(true) {

            System.out.print("Enter the first number: ");
            int n1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int n2 = scanner.nextInt();

            int result = add(n1,n2);

            System.out.println("\n" + "Addition of a and b is " + result + "\n");

            System.out.println("**************************" + "\n");
        }
    }

    public static int add(int a, int b) {
        return a+b;
    }
}