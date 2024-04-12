package in.reshav.java_abstraction;

/* Abstract Keyword => Abstract Class and Abstract Method
                                                       */

public abstract class Vehicle {     // abstract class

    // properties
    protected int noOfTyres;
    protected String color;

    // abstract methods
    public abstract void makeStartSound();
    public abstract void shinesInSun();

    // constructor
    public Vehicle(int noOfTyres, String color) {
        this.noOfTyres = noOfTyres;
        this.color = color;
    }

    // methods
    public void presentState() {
        System.out.println("Going to Himachal Pradesh.");
    }
}