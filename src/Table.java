import java.util.*;
class Table {
    // table of number (input by user)
    Scanner scanner = new Scanner(System.in);
    public void multiplicationTable() {
        System.out.print("Enter a number: ");
        int givenNumber = scanner.nextInt();

        System.out.println();
        for(int i = 1; i <= 10; i++) {
            int result = (givenNumber * i);
            System.out.println(givenNumber + " * " + i + " = " + result);
        }
    }
    public static void main(String[] args) {
        Table table = new Table();
        table.multiplicationTable();
    }
}