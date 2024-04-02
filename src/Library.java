import java.util.*;

public class Library {
    String libInchargeName;
    int bookCount;
    int totalAvalBooks;
    int totalIssuedBooks;
    int bTechBooksCount;
    int mTechBooksCount;
    int phdBooksCount;

    // library details
    public void libDetails(String libInchargeName, int bookCount, int totalAvalBooks, int totalIssuedBooks) {
        this.libInchargeName = libInchargeName;
        this.bookCount = bookCount;
        this.totalAvalBooks = totalAvalBooks;
        this.totalIssuedBooks = totalIssuedBooks;
    }

    // print welcome message and total breakdown of library books
    public void welcomeMessage() {
        System.out.println("\n********** Welcome to SGGS Library **********");
        System.out.println();
        System.out.println("Librarian Incharge: " + libInchargeName);
        //System.out.println();
        /*System.out.println("Welcome to our library, a haven for book lovers and knowledge seekers alike. " +
                "Step into a world where every page holds a new adventure, where stories come to life,\n" +
                "and where learning never ends. Whether you're here to escape reality or to dive into a new" +
                "subject, our library is here to inspire you. Explore our shelves,\ndiscover new worlds, and" +
                " let the magic of books ignite your imagination. Welcome to a place where every book has a story" +
                "to tell and every reader finds a home.");*/
        System.out.println();
        System.out.println("***** Total data of all books in the library *****");
        System.out.println("\nTotal number of Books: " + this.bookCount);
        System.out.println("Available count of Books: " + this.totalAvalBooks);
        System.out.println("Total number of books issued: " + this.totalIssuedBooks);
    }

    // total books breakdown
    public void totalBookCount(int bTechBooksCount, int mTechBooksCount, int phdBooksCount) {
        this.bTechBooksCount = bTechBooksCount;
        this.mTechBooksCount = mTechBooksCount;
        this.phdBooksCount = phdBooksCount;
    }

    // total books info
    public void bookInfo() {
        System.out.println("\n***** Total course-wise data of all books in the library *****");
        System.out.println("\nTotal Count of B.Tech Books: " + this.bTechBooksCount);
        System.out.println("Total Count of M.Tech Books: " + this.mTechBooksCount);
        System.out.println("Total Count of Phd Books: " + this.phdBooksCount);
    }

    // btech books info
    public void bTechBooksInfo(int bTechBooksCount) {
        System.out.println("\n***** Information of B.Tech Books *****");
        this.bTechBooksCount = bTechBooksCount;
        System.out.println("Total Count of B.Tech Books: " + this.bTechBooksCount);
    }

    // mtech books info
    public void mTechBooksInfo(int mTechBooksCount) {
        System.out.println("\n***** Information of M.Tech Books *****");
        this.mTechBooksCount = mTechBooksCount;
        System.out.println("Total Count of M.Tech Books: " + this.mTechBooksCount);
    }

    // phd books info
    public void phdBooksInfo(int phdBooksCount) {
        System.out.println("\n***** Information of PHD Books *****");
        this.phdBooksCount = phdBooksCount;
        System.out.println("Total Count of PHD Books: " + this.phdBooksCount);
    }

    // issued books info
    public void issueBooks() {

    }

    // main method
    public static void main(String[] args) {
        Library library = new Library();
        //library.libDetails("Ms. Shivangi Gupta", 3_00_000, 1_00_000, 2_00_000);
        //library.welcomeMessage();
        //library.totalBookCount(1_00_000, 1_00_000, 1_00_000);
        //library.bookInfo();
        //library.bTechBooksInfo(1_00_000);
        //library.mTechBooksInfo(1_00_000);

        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nEnter your choice from below: \n\n" + "1) Information of Library\n" +
                    "2) B.Tech Books Information\n" + "3) M.Tech Books Information\n" + "4) PHD Books Information\n");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.libDetails("Ms. Shivangi Gupta", 3_00_000, 1_00_000, 2_00_000);
                    library.welcomeMessage();
                    library.totalBookCount(1_00_000, 1_00_000, 1_00_000);
                    library.bookInfo();
                    break;

                case 2:
                    library.bTechBooksInfo(1_00_000);
                    break;

                case 3:
                    library.mTechBooksInfo(1_00_000);
                    break;

                case 4:
                    library.phdBooksInfo(1_00_000);
                    break;

                default:
                    System.out.println("Wrong Input");
                    break;
            }

            if (choice < 1 || choice > 4) {
                return;
            }
        }
    }
}