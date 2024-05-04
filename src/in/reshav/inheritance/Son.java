package in.reshav.inheritance;

public class Son extends Father {

    protected String sonName;

    Son() {

    }

    Son(String fatherName) {
        this.fatherName = fatherName;
    }

    protected void printSonName() {
        sonName = "Reshav";
        System.out.println("Son's name is " + sonName);
    }
}
