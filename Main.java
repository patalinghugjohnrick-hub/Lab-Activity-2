public class Main {

    public static void main(String[] args) {

        Car car = new Car("Honda", "Civic", 2026);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Fazzio", 2025);
        Truck truck = new Truck("Ford", "F-150", 2022, 6);

        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle vehicle : vehicles) {

            vehicle.displayInfo();

            System.out.println("Age: " + vehicle.calculateAge());
            System.out.println("Vintage: " + vehicle.isVintage());

            System.out.println();

            vehicle.moveForward();
            vehicle.moveBackwards();
            vehicle.moveLeft();
            vehicle.moveRight();

            System.out.println("-------------------------");
        }
    }
     }