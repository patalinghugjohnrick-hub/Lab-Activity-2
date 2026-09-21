public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Supra MK4", 1998);
        Vehicle vehicle2 = new Vehicle("BMW", "M4 Competition", 2021);
        Vehicle vehicle3 = new Vehicle("Mercedes-Benz", "G-Class", 2020);

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}