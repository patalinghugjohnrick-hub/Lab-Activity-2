public class Car extends Vehicle {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Car Information ===");
        super.displayInfo();
    }

    @Override
    public void moveForward() {
        System.out.println("Car moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Car moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Car moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Car moves right.");
    }
}