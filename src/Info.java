public class Info {
    private String name;
    private int salary;
    public void getFatherInfo() {
        name = "Reshav";
        salary = 2_00_000;
    }
    public void printFatherInfo() {
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        Info info = new Info();
        info.getFatherInfo();
        info.printFatherInfo();
    }
}