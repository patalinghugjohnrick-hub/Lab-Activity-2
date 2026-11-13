public class Motorcycle extends Vehicle implements Serviceable {

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Motorcycle Information ===");
        super.displayInfo();
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is moving.");
    }

    @Override
    public void moveForward() {
        System.out.println("Motorcycle moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Motorcycle moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Motorcycle moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Motorcycle moves right.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }
}