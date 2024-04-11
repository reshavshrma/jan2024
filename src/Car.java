class CarSample {

    String carName;
    String color;
    int fuel;
    int CurrentFuel;

    public void drive() {
        if(CurrentFuel == 0) {
            System.out.println("\nYou can't drive because there is no fuel in the car.");
        } else if(CurrentFuel < 5) {
            System.out.println("\nYou have limited fuel. Refuel to free and enjoy interrupted services.");
            CurrentFuel--;
        } else {
            System.out.println("\nHello..!! I hope you are enjoying the driving.");
            CurrentFuel--;
        }
    }

    public String colorOfCar(String color) {
        return "\nColor: " + color; // this.color returns the instance variable declaration
        // whereas color is here nothing but returns the arguments
    }
    public void fillFuel(int fuel) {
        CurrentFuel += fuel;
    }

    public int getCurrentFuelLevel() {
        System.out.println("\nFuel added Successfully.");
        return CurrentFuel;
    }

    public static void main(String[] args) {
        CarSample car = new CarSample();
        car.fillFuel(5);
        car.drive();
        car.drive();
        car.getCurrentFuelLevel();
        car.fillFuel(2);
        System.out.println(car.colorOfCar("Red"));
    }
}