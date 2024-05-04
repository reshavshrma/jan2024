package in.reshav;

// structure of car - logical construct is class
class Car {
    int price;
    String engine;
    int noOfSeats;

    Car(int price, String engine, int noOfSeats) {
        this.price = price;
        this.engine = engine;
        this.noOfSeats = noOfSeats;
    }

    public void printData() {
        System.out.println("Price: " + price + "\nLevel of Engine: " + engine + "\nNo of seats: " + noOfSeats);
    }
}

// Objects are the physical reality which occupies space in the memory
// car 1 = maruti
class Maruti extends Car {
    Maruti(int price, String engine, int noOfSeats) {
        super(price, engine, noOfSeats);
    }
}

// car 2 = maruti
class Ferrari extends Car {
    Ferrari(int price, String engine, int noOfSeats) {
        super(price, engine, noOfSeats);
    }
}

// main class
public class Main {
    public static void main(String[] args) {
        Car car = new Car(2_00_000, "Medium", 4);
        Maruti maruti = new Maruti(300000, "High", 5);
        Ferrari ferrari = new Ferrari(500000, "High", 6);
        System.out.println(car);
        System.out.println();
        car.printData();
        System.out.println();
        maruti.printData();
        System.out.println();
        ferrari.printData();
    }
}