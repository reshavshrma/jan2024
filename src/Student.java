public class Student {
    String name;
    int roll_no;

    public void printInfo() {
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        Student s =   new Student();
        s.roll_no = 2;
        s.name = "John";
        s.printInfo();
    }
}
