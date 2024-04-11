import java.util.*;

public class CheckScore {

    Scanner scanner = new Scanner(System.in);

    public void score() {
        System.out.print("Enter your score: ");
        int enteredScore = scanner.nextInt();

        String result = enteredScore > 80 ? "High" : (enteredScore >= 50 ? "Moderate" : "Low");
        System.out.println(result);
    }

    public static void main(String[] args) {
        CheckScore c = new CheckScore();
        c.score();
    }
}
