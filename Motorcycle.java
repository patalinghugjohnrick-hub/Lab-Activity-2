public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Information:");
        super.displayInfo();
    }
}