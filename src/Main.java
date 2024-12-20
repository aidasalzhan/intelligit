// Class representing a vehicle
class Vehicle {
    private String brand;
    private String model;
    private double dailyRate;

    // Constructor to initialize vehicle attributes
    public Vehicle(String brand, String model, double dailyRate) {
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    // Getter and setter methods for each attribute
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Method to represent the object as a string
    public String toString() {
        return brand + " " + model + " ($" + dailyRate + "/day)";
    }
}

// Class representing a client
class Client {
    private String name;

    // Constructor to initialize client attributes
    public Client(String name) {
        this.name = name;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to represent the object as a string
    public String toString() {
        return name;
    }
}

// Class representing a rental service
class RentalService {
    private Client client;
    private Vehicle vehicle;
    private int rentalDays;

    // Constructor to initialize rental service attributes
    public RentalService(Client client, Vehicle vehicle, int rentalDays) {
        this.client = client;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    // Getter and setter methods for each attribute
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total cost of the rental
    public double calculateTotalCost() {
        return vehicle.getDailyRate() * rentalDays;
    }

    // Method to represent the object as a string
    public String toString() {
        return client + " rented " + vehicle + " for " + rentalDays + " days. Total: $" + calculateTotalCost();
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create Vehicle instances
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 50);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 55);

        // Create Client instances
        Client client1 = new Client("Aibek");
        Client client2 = new Client("Zhanar");

        // Create RentalService instances
        RentalService rental1 = new RentalService(client1, vehicle1, 3);
        RentalService rental2 = new RentalService(client2, vehicle2, 5);

        // Print rental details
        System.out.println(rental1);
        System.out.println(rental2);
    }
}
