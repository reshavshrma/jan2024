package in.reshav.inheritance;

public class InheritanceTest extends Son {

    public static void main(String[] args) {
        Father father = new Father();
        father.printFatherName();

        Son son = new Son("Harbans");
        son.printFatherName();
        son.printSonName();
    }
}
