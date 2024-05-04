import java.util.*;
public class Challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("**************** FIRST CHALLENGE *********************");

        System.out.print("Enter the name of a person: ");
        String NAME = scanner.next();

        System.out.println("Welcome " + NAME + " to KG Coding");

        System.out.println("\n**************** SECOND CHALLENGE *********************");
        System.out.print("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;

        System.out.println("Sum of first number and second number is " + sum);

        // Swap two numbers

        System.out.println("\n**************** THIRD CHALLENGE *********************");
        int a = 5; int b = 10; int c;

        System.out.println("Before swapping a: " + a);
        System.out.println("Before swapping b: " + b);

        c = a; // a = 5, b = 10, c = 5
        a = b; // a = 10, b = 10, c = 5
        b = c; // a = 10, b = 5, c = 5
        System.out.println();
        System.out.println("After swapping a: " + a);
        System.out.println("After swapping b: " + b); */

        /*System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println("+ = " + sum);
        System.out.println("- = " + diff);
        System.out.println("* = " + mul);
        System.out.println("/ = " + div);

        System.out.print("Enter first number: ");
        float firstNumber1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float secondNumber1 = scanner.nextFloat();

        float mul1 = firstNumber1*secondNumber1;
        System.out.println(mul);

        // calculate the perimeter of a rectangle

        int A = 5, B = 6, C = 7, D = 8;
        int PerimeterOfRectangleABCD = A + B + C + D;
        System.out.println(PerimeterOfRectangleABCD);

        // calculate the area of triangle

        int base = 5, height = 8;
        int AreaOfTriangle = (int)(0.5*base*height);
        System.out.println(AreaOfTriangle);

        // calculate the simple interest
        int P = 12_000;
        int R = 500;
        int T = 10;

        int SimpleInterest = (P*R*T)/100;
        System.out.println(SimpleInterest);

        // calculate the compound interest
        int p = 12_00;
        int r = 500;
        int t = 10;

        int compoundInterest = (p*(1+r/100)*t);
        System.out.println(compoundInterest)0;

        int F = 225;
        int C = (int)((F-32)*(5.0/9.0));
        System.out.println(C);*/

        // check pos, neg or zero

        /*while(true) {
            System.out.println("\nEnter an integer to check whether it is positive, negative or zero: ");
            int Integer = scanner.nextInt();

            if(Integer >= 1) {
                System.out.println("Positive");
            } else if(Integer < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }*/

        // check even or odd

        /*while(true) {
            System.out.print("\nEnter the number you want to check, whether it is even or not: ");
            int enteredInput = scanner.nextInt();

            if(enteredInput % 2 == 0) {
                System.out.println("\nThe entered input is an even number.");
            } else {
                System.out.println("\nThe entered input is an odd number.");
            }
        }*/

        // check leap year or not
        /*while(true) {
            System.out.print("\nEnter the year you want to check: ");
            int enteredYear = scanner.nextInt();

            if(enteredYear % 400 == 0 || (enteredYear % 4 == 0 && enteredYear % 100  != 0)) {
                System.out.println("\nIt is a Leap Year");
            } else {
                System.out.println("\nIt is not a Leap Year");
            }
        }*/

        // greater among three no's

        /*while(true) {
            System.out.print("Enter first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("\nEnter second number: ");
            int secondNum = scanner.nextInt();

            System.out.print("\nEnter third number: ");
            int thirdNum =  scanner.nextInt();

            System.out.println();
            if(firstNum >= secondNum && firstNum >= thirdNum) {
                System.out.println(firstNum + " is greater among these no's.");
            } else if(secondNum >= firstNum && secondNum >= thirdNum) {
                System.out.println(secondNum + " is greater among these no's.");
            } else {
                System.out.println(thirdNum + " is greater among these no's.");
            }
        }*/

        // calculate grade from marks
        /*while(true) {
            System.out.print("Enter your scored marks: ");
            int scoredMarks = scanner.nextInt();

            if(scoredMarks > 100) {
                System.out.println("You have exceed the marks limit. Kindly enter the marks scored between 1 to 100.");
            } else if(scoredMarks >= 90) {
                System.out.println("Grade: A");
            } else if(scoredMarks >= 75) {
                System.out.println("Grade: B");
            } else if(scoredMarks >= 60) {
                System.out.println("Grade: C");
            } else if(scoredMarks >= 30) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }*/

        // check age to determine category in which fall
        /*while(true) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if(age <= 13) {
                System.out.println("Child");
            } else if(age <= 20) {
                System.out.println("Teen");
            } else if(age <= 60) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
        }*/

        // BitWise Operators

        /*do {
            System.out.print("\nEnter the first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int secondNum = scanner.nextInt();

            int AND = firstNum & secondNum;
            int OR = firstNum | secondNum;
            int XOR = firstNum ^ secondNum;
            int bitwiseComp = ~(firstNum);
            int leftShift = firstNum << 1;
            int rightShift = firstNum >> 1;

            System.out.println("AND: " + AND);
            System.out.println("OR: " + OR);
            System.out.println("XOR: " + XOR);
            System.out.println("Bitwise Compliment: " + bitwiseComp);
            System.out.println("Left shift of " + firstNum + " is " + leftShift);
            System.out.println("Right shift of " + firstNum + " is " + rightShift);

        } while(true);*/

        // even or odd using bit-wise operators

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if((num & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }


    }
}