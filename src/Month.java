import java.util.*;

public class Month {

    Scanner scanner = new Scanner(System.in);

    public void MonthOfTheYear() {
        while(true) {
            System.out.print("Enter the month's number based on which, i will tell you concerned month: ");
            int enteredMonth = scanner.nextInt();

            String output = switch (enteredMonth) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default ->  "Invalid Month";
            };
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        Month month = new Month();
        month.MonthOfTheYear();
    }
}
