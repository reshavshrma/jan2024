import java.util.Scanner;

class CalInJava {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System .in);

        System.out.println("\n" + "Welcome to Java Programming...!! Let's create a simple subtraction program" + "\n");

        while(true) {

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("\n" + "Choose the option which you want: " + "\n" + "1. Addition" + "\n" + "2. Subtraction" + "\n" + "3. Multiplication" + "\n" + "4. Division" + "\n");

        System.out.print("\n" + "Enter option: ");
        int option = scanner.nextInt();

            switch(option) {

                case 1: int sum = a+b;
                System.out.println("\n" + "Addition is: " + sum);
                break;

                case 2: int sub = a-b;
                System.out.println("\n" + "Subtraction is: " + sub);
                break;

                case 3: int mul = a*b;
                System.out.println("\n" + "Multiplication is: " + mul);
                break;

                case 4: if(b != 0) {
                    int div = a/b;
                    System.out.println("\n" + "Division is: " + div);
                }
                else {
                    System.out.println("\n" + "Error...!! Wrong input entered. Please try again.");
                }    
                break;           

                default: System.out.println("\n" + "Sorry..!! You have entered wrong choice. Try again.");
                break;
            }
            System.out.println("\n" + "***********************************************" + "\n");

        }
    }
}