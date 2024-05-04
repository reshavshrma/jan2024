package in.reshav.testOnly;

interface Father {
    void surName();
}

interface Son {
    void surName();
}

class Test implements Father, Son {

    public void surName() {
        System.out.println("Hello, my surname is Sharma." +"\n" + "I am here to provide the details of the" +
                "interfaces here to let you know, what it is actually.");
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.surName();
    }
}