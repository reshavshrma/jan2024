import java.util.*;

public class PasswordChecker {

    public static boolean isValid(String password) {
        if(password.equals("reshav")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredPassword;
        do {
            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextLine();
        } while(!isValid(enteredPassword));
        System.out.println("Correct Password. Login Successful.");
    }
}
