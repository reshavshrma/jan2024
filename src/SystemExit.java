import javax.swing.plaf.synth.SynthStyle;

public class SystemExit {
    String name;
    int roll_no;

    public void giveValues(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void printValues() {
        System.out.println("Name is " + name + "\n" + "Roll no. is " + roll_no);
    }

    public static void main(String args[]) {
        System.out.println("Starting of the program");
        SystemExit se = new SystemExit();
//        System.exit(0);
        se.giveValues("Reshav", 61);
//        System.exit(0);
        se.printValues();
//        System.exit(400);
        System.out.println("End of the Program");
        System.exit(400);

    }
}
