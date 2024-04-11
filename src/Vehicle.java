public abstract class Vehicle {
    String name;
    int maxSpeed;

    Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void printInfo() {
        System.out.println(name + " " + maxSpeed);
    }
}

class Car extends Vehicle {
    String carModel;

    public Car(String name, int maxSpeed, String carModel) {
        super(name, maxSpeed);
        this.carModel = carModel;
        System.out.println(name + " " + maxSpeed + " " + carModel);
    }
}

class Bike extends Vehicle {
    String bikeModel;

    public Bike(String name, int maxSpeed, String bikeModel) {
        super(name, maxSpeed);
        this.bikeModel = bikeModel;
        System.out.println(name + " " + maxSpeed + " " + bikeModel);
    }
}

class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("ALL IN ONE SHOWROOM", 200);
//        vehicle.printInfo();
        Car car = new Car("Hyundai", 120, "ULTRA-S5");
        Bike bike = new Bike("AMI", 180, "R-15");
    }
}