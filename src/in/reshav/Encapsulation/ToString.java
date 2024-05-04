package in.reshav.Encapsulation;

public class ToString {
    String name;
    int roll_no;

    ToString(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(roll_no);
    }

    public String toString() {
//        return "Name: " + name + ", " + "Roll no: " + roll_no;
        return "" + roll_no;
    }

    public static void main(String[] args) {
        ToString ts = new ToString("Reshav", 2022);
        ts.printInfo();
//        String print = ts.toString();
//        System.out.println(print);
        System.out.println(ts);
    }
}
