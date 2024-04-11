import java.util.*;

public class SwitchCase {
    Scanner scanner = new Scanner(System.in);

    public void switchCaseCheck() {
        System.out.print("Enter the day in number of the week, i will tell you the day, then: ");
        int day = scanner.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    public void switchCaseCheck2() {
        System.out.print("Enter the day in number of the week, i will tell you the day, then: ");
        int day = scanner.nextInt();

        String output = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };

        System.out.println(output);
    }

    public static void main(String[] args) {
        SwitchCase s = new SwitchCase();
        s.switchCaseCheck();
        s.switchCaseCheck2();
    }
}
