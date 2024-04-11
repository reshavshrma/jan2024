import java.util.*;

public class MarksToGrade {
    Scanner scanner = new Scanner(System.in);

    public void Grade() {

        System.out.print("Enter your marks(out of 100 marks): ");
        int enteredMarks = scanner.nextInt();

        if(enteredMarks <= 100 && enteredMarks >= 91) {
            System.out.println("Grade: AA");
        } else if(enteredMarks >= 81) {
            System.out.println("Grade: AB");
        } else if(enteredMarks >= 71) {
            System.out.println("Grade: BB");
        } else if(enteredMarks >= 61) {
            System.out.println("Grade: BC");
        } else if(enteredMarks >= 51) {
            System.out.println("Grade: CD");
        } else if(enteredMarks >= 41) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        MarksToGrade mg = new MarksToGrade();
        mg.Grade();
    }
}
