public class Truck extends Vehicle {

    private int tires;

    public Truck(String brand, String model, int year, int tires) {
        super(brand, model, year);
        this.tires = tires;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Information:");
        super.displayInfo();
        System.out.println("Number of Tires: " + tires);
    }
}