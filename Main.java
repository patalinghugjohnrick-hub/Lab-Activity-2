public class Main {

    public static void main(String[] args) {

        // Demo 1
        System.out.println("=== Demo 1 ===");

        Vehicle vehicle = new Truck("Ford", "F-150", 2022, 6);

        vehicle.displayInfo();

        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());

        System.out.println();


        // Demo 2
        System.out.println("=== Demo 2 ===");

        Car car = new Car("Honda", "Civic", 2026);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Fazzio", 2025);
        Truck truck = new Truck("Ford", "F-150", 2022, 6);

        printDetails(car);
        printDetails(motorcycle);
        printDetails(truck);

        System.out.println();


        // Demo 3
        System.out.println("=== Demo 3 ===");

        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle v : vehicles) {

            v.displayInfo();

            System.out.println("Age: " + v.calculateAge());
            System.out.println("Vintage: " + v.isVintage());

            System.out.println();
        }
    }


    public static void printDetails(Vehicle vehicle) {

        vehicle.displayInfo();

        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());

        System.out.println();
    }
}