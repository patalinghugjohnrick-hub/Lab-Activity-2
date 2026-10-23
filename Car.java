public class Car extends Vehicle {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information:");
        super.displayInfo();
    }
}