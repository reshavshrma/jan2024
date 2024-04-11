import java.util.Scanner;

public class LibraryManagementSystem {

    Scanner scanner = new Scanner(System.in);
    String adminLogin; // used
    String studentLogin; // used
    int totalNoOfBooks;
    int avalBooks;
    //boolean issuedBooks;

    // welcome mesg
    public void welcomeMesg() {
        System.out.println("\nWelcome to the SGGS E-Library\n");
        System.out.println("Welcome to the SGGS E-Library! Here, you'll find a wealth of knowledge at your fingertips.\n" +
                "Whether you're a student looking for academic resources or an enthusiast exploring new topics,\n" +
                "we're here to support your quest for learning. Enjoy your journey through our virtual library!.");
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
                System.out.println("\nWrong details entered. Kindly try again. " + (6-i) + " attempts left only.");
            }
        }
    }

    LibraryManagementSystem(int totalNoOfBooks, int avalBooks) {
        this.totalNoOfBooks = totalNoOfBooks;
        this.avalBooks = avalBooks;
        System.out.println("Total no. of books in the Library: " + totalNoOfBooks + "\n" + "Total no. of available books " +
                "in the library: " + avalBooks);
    }

    LibraryManagementSystem() {
        this(6000,2000);
    }

    // admin => issue book, return book, fine

    public void issueBookByAdmin() {
        System.out.print("\nNo. of books you want to get: ");
        int getBook = scanner.nextInt();

        if (avalBooks > 0) {
            if (avalBooks > getBook) {
                avalBooks -= getBook;
                System.out.println(getBook + " books issued. Renew the same within 15 days.");
            } else {
                System.out.println("Not enough books available for issuing.");
            }
        } else {
            System.out.println("Books not available.");
        }
    }

    // student login

    public void StudentLogin() {
        int i = 1;
        while(i <= 5) {
            System.out.println("\n****** Student Login ******");
            System.out.print("\nEnter your registration number: ");
            String enteredRegNo = scanner.nextLine();

            if((enteredRegNo.contains("202")) && ((enteredRegNo.contains("BIT")) || (enteredRegNo.contains("BCS")))) {
                System.out.println("\nStudent Login Successfully.");
                System.out.println("\n***************** STAFF DETAILS  ***************");
                System.out.println("\nName of the Staff: Ms. Shivangi Gupta (B.Sc, B.Lib)"
                        + "\n" + "Position of the Staff: Sr. Librarian");
                System.out.println("\n*************** BOOKS INFORMATION ****************");
                System.out.println("\nYou can now issue book or return books");
                LibraryManagementSystem l = new LibraryManagementSystem();
                break;
            } else {
                i++;
                System.out.println("\nWrong registration number entered. Try again. " + (6-i) + " attempts left only.");
            }
        }
    }


    // student => issue book, return book, pay fine, get info of library

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
//        lms.welcomeMesg();
//        lms.AdminLogin();
//        lms.StudentLogin();
        lms.issueBookByAdmin();
    }
}
