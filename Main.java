public class Main {

    Vehicle vehicle1;
    Vehicle vehicle2;
    Vehicle vehicle3;

    public Main() {
        this.vehicle1 = new Vehicle("Toyota", "Supra MK4", 1998);
        this.vehicle2 = new Vehicle("BMW", "M4 Competition", 2021);
        this.vehicle3 = new Vehicle("Mercedes-Benz", "G-Class", 2020);
    }

    public void displayVehicles() {

        this.vehicle1.displayInfo();
        System.out.println("Age: " + this.vehicle1.calculateAge());
        System.out.println("Vintage: " + this.vehicle1.isVintage());
        System.out.println();

        this.vehicle2.displayInfo();
        System.out.println("Age: " + this.vehicle2.calculateAge());
        System.out.println("Vintage: " + this.vehicle2.isVintage());
        System.out.println();

        this.vehicle3.displayInfo();
        System.out.println("Age: " + this.vehicle3.calculateAge());
        System.out.println("Vintage: " + this.vehicle3.isVintage());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.displayVehicles();
    }
}
