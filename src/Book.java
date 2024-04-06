public class Book {
    String title;
    String author;
    String isbn;

    static int totalBooks;
    boolean isBorrowed;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this(isbn, "UNKNOWN", "RD SHARMA");
    }

    public void borrowBook() {
        if(isBorrowed) {
            System.out.println("Already Borrowed");
        } else {
            isBorrowed = true;
            System.out.println("Collect the book");
        }
    }

    public void returnBook() {
        if(isBorrowed) {
            isBorrowed = false;
            System.out.println("Thanks for returning. Leave a review.");
        } else {
            System.out.println("The book was not borrowed.");
        }
    }

    public static int getTotalBooks() {
        totalBooks = 2_100;
        System.out.println(totalBooks);
        return totalBooks;
    }

    public static void main(String[] args) {
        Book book = new Book("ENGLISH", "RD SHARMA", "2022YES100");
        book.borrowBook();
        book.returnBook();
        getTotalBooks();
    }
}
