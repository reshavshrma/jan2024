import java.util.Scanner;

class DivisionJava {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Welcome to Java Programming...!! Let's create a simple division program" + "\n");

        while(true) { 

            System.out.print("Enter the first number: ");
            int n1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int n2 = scanner.nextInt();

            int result = div(n1,n2);

            System.out.println("\n" + "Division of a and b is " + result + "\n");

            System.out.println("**************************" + "\n");
        }
    }

    public static int div(int a, int b) {
        if(b!=0) {
            return a/b;
        }
        else {
            System.out.println("Error...!! Check and Please Try again later.");
            return 0;
        }
    }
}