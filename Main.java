public class Main {

    // Helper method for the Serviceable interface
    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        // Create one object of each class
        Car car = new Car("Honda", "Civic", 2026);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Fazzio", 2025);
        Truck truck = new Truck("Ford", "F-150", 2022, 6);
        Printer printer = new Printer();

        // Interface Polymorphism
        Serviceable[] serviceItems = {
            car, motorcycle, truck, printer
        };

        System.out.println("===== SERVICE INFORMATION =====");

        for (Serviceable item : serviceItems) {
            performService(item);
        }

        // Abstract Class Polymorphism
        Vehicle[] vehicles = {
            car, motorcycle, truck
        };

        System.out.println("\n===== VEHICLE INFORMATION =====");

        for (Vehicle vehicle : vehicles) {

            vehicle.displayInfo();

            System.out.println("Age: " + vehicle.calculateAge());
            System.out.println("Vintage: " + vehicle.isVintage());

            System.out.println();

            vehicle.move();

            // Existing movement features
            vehicle.moveForward();
            vehicle.moveBackwards();
            vehicle.moveLeft();
            vehicle.moveRight();

            System.out.println("-------------------------");
        }
    }
}