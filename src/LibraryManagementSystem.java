import java.util.Scanner;

public class LibraryManagementSystem {

    Scanner scanner = new Scanner(System.in);
    String LibraryName;
    String adminLogin;
    String studentLogin;
    String adminUserName;
    String password;
    String LibrarianName;
    String positionofLibrarian;
    int totalNoOfBooks;
    int avalBooks;
    int issuedBooks;

    // welcome mesg
    public void welcomeMesg() {
        System.out.println("\nWelcome to the SGGS E-Library\n");
    }

    // admin login
    public void AdminLogin() {
        int i = 1;
        while(i <= 5) {
            System.out.println("\n****** Admin Login ******");
            System.out.print("\nEnter the username: ");
            String enteredUserName = scanner.nextLine();
            System.out.print("Enter the password: ");
            String enterPassword = scanner.nextLine();
            if(enteredUserName.equals("shivangi") && enterPassword.equals("shivangi123")) {
                System.out.println("\nAdmin Login Successfully.");
                break;
            } else {
                i++;
                System.out.println("\nWrong details entered. Kindly try again." + (6-i) + " attempts left only.");
            }
        }
    }

    // student login

    public void StudentLogin() {
        int i = 1;
        while(i <= 5) {
            System.out.println("\n****** Student Login ******");
            System.out.print("\nEnter your registration number: ");
            String enteredRegNo = scanner.nextLine();

            if((enteredRegNo.substring(0,2).equals("202")) && enteredRegNo.contains("BIT") || enteredRegNo.contains("BCS")
                    || enteredRegNo.contains("BME")) {
                System.out.println("\nStudent Login Successfully.");
                break;
            } else {
                i++;
                System.out.println("\nWrong registration number entered. Try again. " + (6-i) + " attempts left only.");
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        //lms.welcomeMesg();
        //lms.AdminLogin();
        lms.StudentLogin();
    }
}
