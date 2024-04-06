interface Family {
    public void caste();
    public void religion();
}


public class Interface implements Family {
    public void caste() {
        System.out.println("Sharma Ji.");
    }

    public void religion() {
        System.out.println("Hindu.");
    }

    public String okay() {
        return "Good";
    }

    public static void main(String[] args) {
        Interface i = new Interface();
        i.caste();
        System.out.println(i.okay());
        i.religion();
    }
}