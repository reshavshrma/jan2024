import java.sql.SQLOutput;
import java.util.*;
public class Discount {

    // age < 5, age > 60, female > 50
    Scanner sc = new Scanner(System.in);

    public void checkDiscount() {
        while(true) {
            System.out.println("\nEnter your age to get discount: ");
            int isAge = sc.nextInt();
            sc.nextLine();
            System.out.println("\nEnter your category to get discount: ");
            String isCategory = sc.nextLine();

            if(isAge <= 5) {
                System.out.println("You will get 75% discount.");
            } else if(isAge > 60 && (isCategory.equals("female") || isCategory.equals("male"))) {
                System.out.println("You will get 80% discount.");
            } else if(isAge < 60 && isCategory.equals("female")) {
                System.out.println("You will get 50% discount.");
            } else {
                System.out.println("You will get 25% discount.");
            }
        }
    }

    public static void main(String[] args) {
        Discount dis = new Discount();
        dis.checkDiscount();
    }
}
