import java.util.*;

public class AbsoluteValue {

    Scanner scanner = new Scanner(System.in);

    public void getAbsoluteValue() {
        System.out.print("Enter an integer: ");
        int enteredNum = scanner.nextInt();

        int result = enteredNum < 0 ? -enteredNum : enteredNum;
        System.out.println(result);
    }

    static public void main(String ...args) {
        AbsoluteValue a = new AbsoluteValue();
        a.getAbsoluteValue();
    }
}
