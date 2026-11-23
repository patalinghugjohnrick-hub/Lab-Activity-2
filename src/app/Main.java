spackage app;

import contracts.Serviceable;
import devices.Printer;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.Vehicle;

public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Honda", "Civic", 2026);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Fazzio", 2025);
        Truck truck = new Truck("Ford", "F-150", 2022, 6);
        Printer printer = new Printer();

        Serviceable[] serviceItems = {
            car, motorcycle, truck, printer
        };

        System.out.println("===== SERVICE INFORMATION =====");

        for (Serviceable item : serviceItems) {
            performService(item);
        }

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
            vehicle.moveForward();
            vehicle.moveBackwards();
            vehicle.moveLeft();
            vehicle.moveRight();

            System.out.println("-------------------------");
        }
    }
}