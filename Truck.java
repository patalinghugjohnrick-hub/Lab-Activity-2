public class Truck extends Vehicle {

    private int tires;

    public Truck(String brand, String model, int year, int tires) {
        super(brand, model, year);
        this.tires = tires;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Truck Information ===");
        super.displayInfo();
        System.out.println("Tires: " + tires);
    }

    @Override
    public void moveForward() {
        System.out.println("Truck moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Truck moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Truck moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Truck moves right.");
    }
}