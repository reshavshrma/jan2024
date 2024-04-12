package in.reshav.java_abstraction;

public class Car extends Vehicle {

    public String model ;

    public Car(int noOfTyres, String color, String model) {
        super(noOfTyres, color);
        this.model = model;
    }

    public void makeStartSound() {
        System.out.println("Vrum");
    }

    public void shinesInSun() {
        System.out.println("Shines like diamond in the sunlight.");
    }

    public void printInfo() {
        System.out.println("Tyres: " + noOfTyres + ", " + "Color: " + color + ", " + "Model: " + model);
        makeStartSound();
        shinesInSun();
        presentState();
    }
}
