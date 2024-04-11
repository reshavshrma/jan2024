import java.util.*;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void calculate() {
        while (true) {
            System.out.println();
            System.out.print("Enter the first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int secondNum = scanner.nextInt();

            System.out.println("\nWhat you want to do: " + "\n1. Addition " + "\n2. Subtraction " + "\n3. Multiplication" +
                    "\n4. Division");
            int enteredChoice = scanner.nextInt();

            int result;
            switch(enteredChoice) {
                case 1: result = firstNum + secondNum;
                    System.out.println("\nAddition: " + result);
                    break;

                case 2: result = firstNum - secondNum;
                    System.out.println("\nSubtraction: " + result);
                    break;

                case 3: result = firstNum * secondNum;
                    System.out.println("\nMultiplication: " + result);
                    break;

                case 4: if(secondNum == 0) {
                    System.out.println("\nInvalid second number, divide by zero is not possible.");
                } else {
                    result = firstNum/secondNum;
                    System.out.println("\nDivision: " + result);
                }
                    break;

                default:
                    System.out.println("\nInvalid input entered");
                    break;
            }
        }
    }

    static public void main(String ...args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
    }
}
